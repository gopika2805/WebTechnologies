import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeviceDatabase")
public class DeviceDatabaseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardwaredb", "root", "password");

            PreparedStatement ps = con.prepareStatement("SELECT * FROM devices");
            ResultSet rs = ps.executeQuery();

            out.println("<h1>Device Information</h1>");
            out.println("<table border='1'><tr><th>Device Name</th><th>Description</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getString("device_name") + "</td><td>" + rs.getString("description") + "</td></tr>");
            }
            out.println("</table>");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
