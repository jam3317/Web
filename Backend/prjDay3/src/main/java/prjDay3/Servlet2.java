package prjDay3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//회원정보조회하는 서비스 
@WebServlet("/s21013")
public class Servlet2  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		
		String id  = request.getParameter("id");		
		// id에 대한 회원정보를 DB로 가져온다(작업)		
		// 임의로		
		String name="홍길동";
		String addr="서울";
		
		//Model
		User user = new User( id, name, addr);		
		
		/*
		 * 
		 *  고객정보 응답 가능 
		 * 
		 * 
		 */
		
		RequestDispatcher r = request.getRequestDispatcher("/resultView.jsp");
		
		//reequest에 Model 심기
		request.setAttribute("userInfo", user);		  // key, value(데이터)
		r.forward(request, response);
		
		
		
	}
}
