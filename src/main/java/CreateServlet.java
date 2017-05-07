import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by USER on 30.04.2017.
 */
@WebServlet(name = "CreateServlet")
public class CreateServlet extends HttpServlet {
Dao dao = Dao.getDao();
    private final AtomicInteger ids = new AtomicInteger();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dao.add(new Student(ids.incrementAndGet(),request.getParameter("name"),request.getParameter("family")));
        response.sendRedirect("StudentsViewServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
