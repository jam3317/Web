package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/ex0101")
public class Ex01_01 extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		System.out.println("start");
		
		//입력
		String su1_ = req.getParameter("su1");
		String su2_ = req.getParameter("su2");
		String op = req.getParameter("op");  // ?su1=3&su2=10&op=+
		
		System.out.println(su1_);
		System.out.println(su2_);
		System.out.println(op);
		
		int su1 = 0;
		int su2 = 0;
		
		if(su1_ != null && su2_ != null) {
			 su1 = Integer.parseInt(su1_);
			 su2 = Integer.parseInt(su2_);
		}
		
		
		//처리
		int result = 0;
		switch(op) {
			case "add":
				result = su1 + su2;
				break;
			case "minus":
				result = su1 - su2;
				break;
			case "divide":
				result = su1 / su2;
				break;
			default :
				result = 0;
		
		}
		
		
		
		//출력
		System.out.println(result);
		PrintWriter out = res.getWriter();
		
		out.println(result);
		
		
		
	}
}
