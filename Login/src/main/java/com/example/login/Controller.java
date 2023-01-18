package com.example.login;
        import jakarta.servlet.ServletException;
        import jakarta.servlet.annotation.WebServlet;
        import jakarta.servlet.http.HttpServlet;
        import jakarta.servlet.http.HttpServletRequest;
        import jakarta.servlet.http.HttpServletResponse;

        import java.io.IOException;
        import java.io.PrintWriter;
@WebServlet(name = "hello", value = "/controller")
public class Controller extends HttpServlet {
    private String loginEntered;
    private String passwordEntered;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        loginEntered = request.getParameter("login");
        passwordEntered = request.getParameter("password");
        request.setAttribute("login", loginEntered);
        request.setAttribute("password", passwordEntered);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }

    public void destroy() {
    }
}