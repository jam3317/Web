package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/ex01")
public class Ex01 extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("start");
		
		//입력
		String su1_ = req.getParameter("su1");
		String su2_ = req.getParameter("su2");
		int su1 = 0;
		int su2 = 0;
		
		if(su1_ != null && su2_ != null) {
			 su1 = Integer.parseInt(su1_);
			 su2 = Integer.parseInt(su2_);
		}
		
		
		//처리
		int result = su1 + su2;
		
		//출력
		System.out.println(result);
		PrintWriter out = res.getWriter();
		
		out.println(result);
		
		
		
	}
}
