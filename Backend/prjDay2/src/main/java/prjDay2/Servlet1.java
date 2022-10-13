package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1012")
public class Servlet1  extends HttpServlet{
  
	   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //  resp.setContentType("text/plain;charset=utf-8");	
		   req.setCharacterEncoding("UTF-8");		
		   resp.setCharacterEncoding("UTF-8");
		   resp.setContentType("text/html;charset=utf-8");
		   
		   
		   String key = req.getParameter("key");
		   System.out.println( key);
		   
		   
		   System.out.println("start");		   
		   PrintWriter  out  =  resp.getWriter();
		   out.println( "hello~~  <br><br>  web");
		   out.println( "hi1");
		   out.println( "hi2");
		   
		   
	}
}