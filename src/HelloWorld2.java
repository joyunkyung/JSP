

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2")
public class HelloWorld2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
//		resp.setContentType("text/html");
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World2!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World222~!!!</h1>");
		out.println("<h1>æ»≥Á«œººø‰~!~!</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
