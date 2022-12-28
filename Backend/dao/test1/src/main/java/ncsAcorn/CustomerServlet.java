package ncsAcorn;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		CustomerService service = new CustomerService();
		ArrayList<CustomerDto> list = service.list();
		
		request.setAttribute("list",list);
		request.getRequestDispatcher("/WEB-INF/views/customerList.jsp").forward(request, response);
	}
}
