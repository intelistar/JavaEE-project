package com.example.projectjavaee;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "registrationServlet", value = "/registrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем данные из запроса
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Передаем данные в объект запроса для передачи на JSP страницу
        request.setAttribute("name", name);
        request.setAttribute("email", email);

        // Перенаправляем запрос на другую JSP страницу
        RequestDispatcher dispatcher = request.getRequestDispatcher("../../../webapp/main.jsp");
        dispatcher.forward(request, response);

    }
}