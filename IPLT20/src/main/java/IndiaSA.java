import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletConfig;//interface
import javax.servlet.ServletException;//class
import javax.servlet.annotation.WebServlet;//class & annotation
import javax.servlet.http.HttpServlet;//class
import javax.servlet.http.HttpServletRequest;//interface
import javax.servlet.http.HttpServletResponse;//interface



//Name of servlet
@WebServlet("/IndSA")
public class IndiaSA extends HttpServlet {
public int visitorCount=0;
private static final long serialVersionUID = 1L;

public IndiaSA() {

}
public void init(ServletConfig config) throws ServletException {

	super.init(config);
}

public void destroy() {
	super.destroy();
}

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	super.service(request, response);
}




protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//HttpServletRequest represents HttpRequest packet
	//HttpServletResponse represents HttpResponse packet
	PrintWriter pw=response.getWriter();//used to write data to response packet
	response.setContentType("text/html");
	java.util.Date today=new java.util.Date();
	pw.println("<HTML><BODY>");
	pw.println("<B>Welcome to IndiaSA match..</B>");
	pw.println("<BR><B>Today : "+today + "</B>");
	visitorCount++;
	pw.println("<B>You are visitor # "+ visitorCount + "</B><br>");
	pw.println("<B><a href='getScores'>Score Card</a></B>");
	pw.println("</BODY></HTML>");
	//response.getWriter().append("Served at: ").append(request.getContextPath());



}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}



}