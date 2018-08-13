import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException{
        System.out.println("Inside ServletConfig");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("Inside getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Inside Service");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.print("<html><body>");
        printWriter.print("<h1> Welcome to server side programming. </h1>");
        printWriter.print("</body></html>");
        ServletConfig config = getServletConfig();
        System.out.println("Hi Kudos");
        System.out.println("Okay");

    }

    @Override
    public String getServletInfo() {
        System.out.println("Inside getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Inside destroy method");

    }

}
