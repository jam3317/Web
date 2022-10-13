package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/s21012")
public class Servlet2 extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("*{ color : blue; }");
		out.println("* div { border: 1px solid black; }");
		out.println("* div input{ width : 100px; height : 40px; }");
		
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		
		
		out.println("생년월일<br>");
		out.println("<input type=\"text\" class=\"year\" placeholder=\"년(4자)\">");
		out.println("<select class=\"month\">");
		out.println("<option>월</option>");
		out.println("<option>1</option>");
		out.println("<option>2</option>");
		out.println("<option>3</option>");
		out.println("<option>4</option>");
		out.println("<option>5</option>");
		out.println("<option>6</option>");
		out.println("<option>7</option>");
		out.println("<option>8</option>");
		out.println("<option>9</option>");
		out.println("<option>10</option>");
		out.println("<option>11</option>");
		out.println("<option>12</option>");
		out.println("</select>");
        
		out.println("<input type=\"text\" class=\"day\" placeholder=\"일\">");
        
        
        
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
