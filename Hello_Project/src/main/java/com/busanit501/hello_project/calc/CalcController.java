package com.busanit501.hello_project.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    // post 처리반, 로직처리 하기.
    // 사용자로부터 전달 받은 숫자 2개를 단순 출력만 하기.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        resp.sendRedirect("/index");
    }
}
