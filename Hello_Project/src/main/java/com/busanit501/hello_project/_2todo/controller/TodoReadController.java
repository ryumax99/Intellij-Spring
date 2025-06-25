package com.busanit501.hello_project._2todo.controller;

import com.busanit501.hello_project._2todo.dto.TodoDTO;
import com.busanit501.hello_project._2todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TodoReadController : 하나 조회 ");
        // 임의의  todo 번호, 100
        // 더미 데이터 가져오기, 현재는 메모리 작업,
        // /todo/read?tno=100, 쿼리 스트링 형식으로 , 파라미터 전달 받기.
        // 문자열을 받아와서, 타입 변환, 롱 타입으로
        Long tno = Long.parseLong(req.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.getTodoByTno(tno);
        req.setAttribute("dto",dto);
        req.getRequestDispatcher("/WEB-INF/todo/todoRead.jsp").forward(req,resp);
    }
}
