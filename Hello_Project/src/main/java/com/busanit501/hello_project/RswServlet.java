package com.busanit501.hello_project;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RswServlet", urlPatterns = "/rsw")
public class RswServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws SecurityException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>류성원 서블릿 테스트</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>서버에서, 서블릿이라는 자바클래스, html 화면으로 변환해서 전달하기</h1>");
        out.println("<h2>나만의 서블릿 자바 클래스 만들어서, 테스트 연습 해보기.</h2>");
        out.println("</body>");
        out.println("</html>");
        }
}
