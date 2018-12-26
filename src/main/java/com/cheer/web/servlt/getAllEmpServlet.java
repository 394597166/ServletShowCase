package com.cheer.web.servlt;

import com.cheer.mybatis.util.EmpMapperImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Servlet命名
@WebServlet(name = "getAllEmpServlet",value = "/servlet/getAllEmpServlet")
public class getAllEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置数据格式
        response.setContentType("application/json;charset=utf-8");
        //创建Mapper实例方法对象
        EmpMapperImpl empMapper = new EmpMapperImpl();
        //创建Gson对象
        Gson gson = new Gson();
        //获得json数据集
        String json = gson.toJson(empMapper.getAllEmp());
        //获得输出流
        PrintWriter printWriter = response.getWriter();
        //输出json数据集
        printWriter.print(json);
        //输出流关闭
        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用doPost方法
        this.doPost(request, response);
    }
}
