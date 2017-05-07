import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

/**
 * Created by USER on 30.04.2017.
 */
@WebServlet(name = "ServletView")
public class ServletView extends HttpServlet {
    Dao dao = Dao.getDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students",this.dao.getValues());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("studentView.jsp");
        requestDispatcher.forward(request, response);
    }
}
