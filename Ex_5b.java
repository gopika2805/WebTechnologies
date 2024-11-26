import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet mapping
@WebServlet("/DeviceServlet")
public class DeviceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the selected device from the request
        String device = request.getParameter("device");

        // HTML response
        out.println("<html><head><title>Device Details</title></head><body>");
        out.println("<h1>Device Information</h1>");

        if (device != null) {
            // Match device and return description
            switch (device.toLowerCase()) {
                case "keyboard":
                    out.println("<p><b>Keyboard:</b> A device used for typing and inputting data into a computer.</p>");
                    break;
                case "mouse":
                    out.println("<p><b>Mouse:</b> A device used to point, click, and interact with the graphical interface.</p>");
                    break;
                case "monitor":
                    out.println("<p><b>Monitor:</b> A display device used to visually output data from the computer.</p>");
                    break;
                case "printer":
                    out.println("<p><b>Printer:</b> A device used to produce hard copies of digital documents or images.</p>");
                    break;
                default:
                    out.println("<p>Device information not found.</p>");
            }
        } else {
            out.println("<p>No device selected. Please go back and select a device.</p>");
        }

        out.println("<br><a href='index.html'>Back to Home</a>");
        out.println("</body></html>");
    }
}
