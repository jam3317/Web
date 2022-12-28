package ncsAcorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "oracle";
	Connection con = null;
	
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if( con != null) {
				System.out.println("연결성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<CustomerDto> list(){
		
		ArrayList<CustomerDto> list = new ArrayList<>();
		dbCon();
		String sql = "select * from test_customer";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				CustomerDto customerdto = new CustomerDto();
				String name = rs.getString(1);
				String id = rs.getString(2);
				String address = rs.getString(3);
				
				customerdto.setName(name);
				customerdto.setId(id);
				customerdto.setAddress(address);
				
				list.add(customerdto);
			}
			pst.close();
			con.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		ArrayList<CustomerDto> list = dao.list();
		
		for(CustomerDto customer : list) {
			System.out.println(customer);
		}
	}
}
