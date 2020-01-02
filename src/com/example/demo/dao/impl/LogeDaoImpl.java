package com.example.demo.dao.impl;

import com.example.demo.dao.LogeDao;
import com.example.demo.entity.Loge;
import com.example.demo.util.DButil;

/**
 * @author 曹郁楠
 */
public class LogeDaoImpl implements LogeDao {
    @Override
    public void insertLoge(Loge loge) {
        String sql = "insert into loge(text,date) values(?,?)";
        Object[] object = {loge.getText(),loge.getDate()};
        DButil.excuteDML(sql,object);
    }
}
