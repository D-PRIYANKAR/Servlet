import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")  // This is the URL mapping
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to MyServlet!</h1>");
        out.println("<p>You entered: " + request.getParameter("username") + "</p>");
        
        String un=request.getParameter("un");
        if(un.equals("admin"))
        {
        	response.sendRedirect("NewFile.jsp");
        }
        if(un.equals("priyankar"))
        {
        	response.sendRedirect("NewFile1.jsp");
        }
       
        
        
        
    }
}
