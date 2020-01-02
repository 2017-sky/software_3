package com.example.demo.service.impl;

import com.example.demo.dao.LogeDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.dao.impl.LogeDaoImpl;
import com.example.demo.dao.impl.StudentDaoImpl;
import com.example.demo.entity.Loge;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import java.util.Date;

/**
 * @author 曹郁楠
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();
    private LogeDao logeDao = new LogeDaoImpl();

    @Override
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
        Loge loge = new Loge();
        loge.setText("添加学生："+student.getName());
        loge.setDate(new Date());
        logeDao.insertLoge(loge);
    }
}
