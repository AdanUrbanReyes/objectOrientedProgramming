import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Triangulo extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {

    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    String name = req.getParameter("renglones");
    int reng =Integer.parseInt(name);
    out.println("<HTML>");
    out.println("<HEAD><TITLE>Triangulo</TITLE></HEAD>");
    out.println("<BODY>");
	out.println("<CENTER>");
    out.println("<H1>Triangulo</H1>");
	out.println("<HR>");
	
    for(int i=0; i< reng; i++){
	for(int j=0; j< i+1; j++)
    		out.println("*");
	out.println("<BR>");
    }
	out.println("</CENTER>");
    out.println("</BODY></HTML>");
  }

}
