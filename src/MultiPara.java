

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
		String[] item; //getParameterValues���� �迭�� ��Ÿ��
	//item = request.getParameter("item");
	item = request.getParameterValues("item"); //������ 
	PrintWriter out = response.getWriter(); //��ü����
	out.println("���õ� �׸���");
	
	for (int i = 0; i < item.length; i++) {
		out.println(" : "+item[i]);
	}
	out.println("�Դϴ�.");
	}

	


}
