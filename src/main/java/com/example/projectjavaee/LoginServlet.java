package com.example.projectjavaee;

import java.io.*;
import java.util.Objects;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем данные из запроса
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (Objects.equals(login, "") || Objects.equals(password, "")) {
            // Если поля ввода пустые то выводим ошибку
            request.setAttribute("errorMessage", "Password or login must be not empty!!");
            // Перенаправляем на ту же JSP страницу
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
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