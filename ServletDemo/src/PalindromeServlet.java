

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class PalindromeServlet
 */
@WebServlet("/palindrome")
public class PalindromeServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public PalindromeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		Configuration
		PrintWriter pw;
		response.setContentType("text/html");
		pw=response.getWriter();
		
//		Request Processing
		String name=request.getParameter("name");
		name=name.toLowerCase();
		StringBuilder builder = new StringBuilder(name);
		builder=builder.reverse();
		String reverse=builder.toString();
		
		String palindromeStatus=name.equalsIgnoreCase(reverse)?"It is a Palindrome":"It is not a Palindrome";
		
//		Response Processing
		
		pw.println("<html><body>");
		
		
		pw.println("<b>Given String : "+name+": "+palindromeStatus+"</b>");
		
		pw.println("</body></html>");
		
		pw.close();
		
		
	}

}
