package pk11;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		LoginServlet ls=new LoginServlet();
		method(ls);
		
	}
	
	public static void method(HttpServlet Service) {
		Service.service();
	}

}
