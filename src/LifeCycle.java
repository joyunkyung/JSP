

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
		System.out.println("init 메소드는 첫 요청만 호출됨: " + initCount++);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 메소드는 요청때마다 호출됨: " + serviceCount++);
	}
	
	public void destroy() {
		System.out.println("destroy 메소드는 톰캣 종료될때만 호출됨: " + destroyCount++);
	}

}
