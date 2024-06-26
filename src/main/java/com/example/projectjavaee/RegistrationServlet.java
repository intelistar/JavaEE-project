package com.example.projectjavaee;

import java.io.*;
import java.util.Objects;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "registrationServlet", value = "/registrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем данные из запроса
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String passwordCheck = request.getParameter("passwordCheck");

        if (!Objects.equals(password, passwordCheck)) {
            // Если пароли не совпадают, устанавливаем сообщение об ошибке на странице
            request.setAttribute("errorMessage", "Passwords are not the same!");
            // Перенаправляем на ту же JSP страницу
            RequestDispatcher dispatcher = request.getRequestDispatcher("registration.jsp");
            dispatcher.forward(request, response);
            return; // Прерываем выполнение метода
        }

        // Передаем данные в объект запроса для передачи на JSP страницу
        request.setAttribute("login", login);
        request.setAttribute("password", password);

        // Перенаправляем запрос на другую JSP страницу
        RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
        dispatcher.forward(request, response);
    }
}