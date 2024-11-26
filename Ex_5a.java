import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeviceServlet")
public class DeviceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String type = request.getParameter("type");
        out.println("<h1>Details about " + type + "</h1>");
        switch (type) {
            case "keyboard":
                out.println("<p>A keyboard is used for typing and entering commands.</p>");
                break;
            case "mouse":
                out.println("<p>A mouse is used for pointing, clicking, and navigating.</p>");
                break;
            case "monitor":
                out.println("<p>A monitor is an output device that displays visuals.</p>");
                break;
            default:
                out.println("<p>Unknown device.</p>");
        }
        out.println("<a href='index.html'>Back to Home</a>");
    }
}
