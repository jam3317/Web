package prjDay3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s11013")
public class Servlet1  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	 
		
		String id  = request.getParameter("id");		
		System.out.println(" call");		
		PrintWriter  out  =response.getWriter();
		
		//회원정보 확인하는 작업
		//회원인경우 		
		out.println( id + " hi!!!");
		
		// 아닌경우
		
	}
	
}
