package com.busanit501.hello_project._2todo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoUpdateController" , urlPatterns = "/todo/update")
public class TodoUpdateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoUpdateController.doGet 호출, 목록 화면제공. ");
        req.getRequestDispatcher("/WEB-INF/todo/todoUpd.jsp").forward(req,resp);

    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("TodoUpdateController.doPost <UNK>, <UNK>. ");
//    }
}
