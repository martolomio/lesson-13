package testservelet;

import com.google.gson.Gson;
import dao.service.implService.UserServiceImpl;
import domain.User;
import dao.service.UserService;
import dto.UserLog;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserService userService = UserServiceImpl.getUserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userService.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            request.setAttribute("userEmail", email);
            request.getRequestDispatcher("cadinet.jsp").forward(request, response);
            UserLog userLog = new UserLog();
            userLog.passwordUrl = "cadinet.jsp";
            userLog.email = user.getEmail();

            String json = new Gson().toJson(userLog);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }
    }
}
