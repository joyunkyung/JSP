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
//      response.setContentType("text/html;charset=euc-kr"); //응답.방식(텍스트/html; 한글로);
//	   request.setCharacterEncoding("UTF-8");  //response.setContentType("text/html;charset=utf-8");로도 안되면 추가
      response.setContentType("text/html;charset=utf-8"); //응답.방식(텍스트/html; 한글로);
      PrintWriter out = response.getWriter();
      String id = "", name= "", vclass="", phone1="", phone2="", phone3="";
      id = request.getParameter("id"); //name들을 받을 수 있음
      name = request.getParameter("name"); //name들을 받을 수 있음
      vclass = request.getParameter("class"); //name들을 받을 수 있음
      phone1 = request.getParameter("phone1"); //name들을 받을 수 있음
      phone2 = request.getParameter("phone2"); //name들을 받을 수 있음
      phone3 = request.getParameter("phone3"); //kkk들을 받을 수 있음
      out.println("<html><head></head><body>");
      out.println("당신이 입력한 정보 (get방식)입니다."
            + "<br> 아 이 디 : <b>");
      out.println(id);
      out.println("</b><br> 이름 : <b>"); 
      out.println(name);
      out.println("</b><br> 구분 : <b>"); 
      out.println(vclass);
      out.println("</b><br> 전화번호 : <b>"); 
      out.println(phone1);
      out.println("-");
      out.println(phone2);
      out.println("-");      
      out.println(phone3);
      out.println("</b><br><a href='javascript:history.go(-1)'> 다시 </a>"); 
      out.println("</body></html>");
   }
}