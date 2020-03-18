package com.xducs.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Linbo Ge
 * @date 2020/3/12 - 15:58
 */
@WebServlet("/RequestDemo8")
public class RequestDemo8 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8被访问了。。。");
        //转发到demo9资源
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo9");
        requestDispatcher.forward(request,response);*/
        //存储数据到request域中
        request.setAttribute("msg","hello");
        request.getRequestDispatcher("/RequestDemo9").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}