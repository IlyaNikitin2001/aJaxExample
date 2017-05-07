import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by USER on 06.05.2017.
 */
@WebServlet(name = "GetUserServlet")
public class GetUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        получаем имя
        String userName = request.getParameter("userName").trim();
        String password = request.getParameter("password").trim();
//        если ничего не введем в поле то выведет Guest
        if(userName == null || "".equals(userName) ){
            userName = "Guest";
        }
        if (password == null || "".equals(password)){
            password = "password";
        }

        String greetings = "Hello " + userName +" "+ password;


        response.setContentType("text/plain");
        response.getWriter().write(greetings);
    }
}
