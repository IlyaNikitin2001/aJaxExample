import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by USER on 04.05.2017.
 */
@WebServlet(name = "EditServlet")
public class EditServlet extends HttpServlet {
    Dao dao = Dao.getDao();
    private final AtomicInteger id = new AtomicInteger();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.dao.edit(new Student(this.id.incrementAndGet(), request.getParameter("name"), request.getParameter("family")));
response.sendRedirect("StudentsViewServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("student",this.dao.get(Integer.parseInt(request.getParameter("id"))));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Edit.jsp");
        requestDispatcher.forward(request, response);
    }
}
