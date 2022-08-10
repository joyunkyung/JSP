

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MultiPara")
public class MultiPara extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String[] item; //getParameterValues사용시 배열로 나타냄
	//item = request.getParameter("item");
	item = request.getParameterValues("item"); //여러값 
	PrintWriter out = response.getWriter(); //객체생성
	out.println("선택된 항목이");
	
	for (int i = 0; i < item.length; i++) {
		out.println(" : "+item[i]);
	}
	out.println("입니다.");
	}

	


}
