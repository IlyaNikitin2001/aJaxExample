import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by USER on 30.04.2017.
 */
@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    Dao dao = Dao.getDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dao.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect("StudentsViewServlet");
    }
}
