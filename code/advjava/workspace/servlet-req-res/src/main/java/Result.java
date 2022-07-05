

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String data = request.getParameter("msg");
		
		out.print("<div align='center'>");
		out.print("<h1>Your Result...</h1>");
		
		out.print("<h1>Your Mesage : "+data+"</h1>");
		
		out.print("</div>");
	}

}
