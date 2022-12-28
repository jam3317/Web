package ncsAcorn;

import java.util.ArrayList;

public class CustomerService {
	
	CustomerDao dao = new CustomerDao();
	

	public ArrayList<CustomerDto> list() {
		
		
		
		ArrayList<CustomerDto> list = dao.list();
		
		return list;
	}
}
