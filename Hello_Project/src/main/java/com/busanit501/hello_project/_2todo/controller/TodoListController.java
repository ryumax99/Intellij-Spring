package com.busanit501.hello_project._2todo.controller;

import com.busanit501.hello_project._2todo.dto.TodoDTO;
import com.busanit501.hello_project._2todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoListController.doGet 호출, 목록 화면제공. ");

        // 작업1
        // 서비스에게 데이터 요청
        List<TodoDTO> dtoList = TodoService .INSTANCE.getList();

        // 작업2
        // 화면에 데이터 첨부
        req.setAttribute("list", dtoList);

        req.getRequestDispatcher("/WEB-INF/todo/todoList.jsp").forward(req,resp);

    }
}
