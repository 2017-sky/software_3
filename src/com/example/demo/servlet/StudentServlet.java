package com.example.demo.servlet;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.impl.StudentDaoImpl;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/insert")
public class StudentServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        StudentService studentService = new StudentServiceImpl();
        StudentDao studentDao = new StudentDaoImpl();
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentDao.insertStudent(student);
        response.sendRedirect(request.getContextPath()+"/InsertOperate.jsp");
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
