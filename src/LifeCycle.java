

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	int initCount = 1;
	int serviceCount = 1;
	int destroyCount = 1;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼ҵ�� ù ��û�� ȣ���: " + initCount++);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service �޼ҵ�� ��û������ ȣ���: " + serviceCount++);
	}
	
	public void destroy() {
		System.out.println("destroy �޼ҵ�� ��Ĺ ����ɶ��� ȣ���: " + destroyCount++);
	}

}
