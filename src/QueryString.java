import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QueryString")
public class QueryString extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      response.setContentType("text/html;charset=euc-kr"); //����.���(�ؽ�Ʈ/html; �ѱ۷�);
//	   request.setCharacterEncoding("UTF-8");  //response.setContentType("text/html;charset=utf-8");�ε� �ȵǸ� �߰�
      response.setContentType("text/html;charset=utf-8"); //����.���(�ؽ�Ʈ/html; �ѱ۷�);
      PrintWriter out = response.getWriter();
      String id = "", name= "", vclass="", phone1="", phone2="", phone3="";
      id = request.getParameter("id"); //name���� ���� �� ����
      name = request.getParameter("name"); //name���� ���� �� ����
      vclass = request.getParameter("class"); //name���� ���� �� ����
      phone1 = request.getParameter("phone1"); //name���� ���� �� ����
      phone2 = request.getParameter("phone2"); //name���� ���� �� ����
      phone3 = request.getParameter("phone3"); //kkk���� ���� �� ����
      out.println("<html><head></head><body>");
      out.println("����� �Է��� ���� (get���)�Դϴ�."
            + "<br> �� �� �� : <b>");
      out.println(id);
      out.println("</b><br> �̸� : <b>"); 
      out.println(name);
      out.println("</b><br> ���� : <b>"); 
      out.println(vclass);
      out.println("</b><br> ��ȭ��ȣ : <b>"); 
      out.println(phone1);
      out.println("-");
      out.println(phone2);
      out.println("-");      
      out.println(phone3);
      out.println("</b><br><a href='javascript:history.go(-1)'> �ٽ� </a>"); 
      out.println("</body></html>");
   }
}