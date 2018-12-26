package com.cheer.web.servlt;

import com.cheer.mybatis.util.DeptMapperImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Servlet命名
@WebServlet(name = "deleteDeptWithDeptnoServlet",value = "/servlet/deleteDeptWithDeptnoServlet")
public class deleteDeptWithDeptnoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer deptno = Integer.valueOf(request.getParameter("deptno"));
        //创建Mapper实例方法对象
        DeptMapperImpl deptMapper = new DeptMapperImpl();
        //删除数据
        deptMapper.deleteDept(deptno);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用doPost方法
        this.doPost(request, response);
    }
}
