package com.cheer.mybatis.util;

import com.cheer.mybatis.dao.DeptMapper;
import com.cheer.mybatis.dao.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mapper类
 */
public abstract class AbstractMapper {
    InputStream in = null;
    SqlSession sqlSession = null;
    DeptMapper deptMapper = null;
    EmpMapper empMapper = null;

    public void Before(){
        try {
            //得到输入流
            in = Resources.getResourceAsStream("mybatis-config.xml");
            //得到SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            //设置事务自动提交
            sqlSession =sqlSessionFactory.openSession(true);
            //得到deptMapper对象
            deptMapper = sqlSession.getMapper(DeptMapper.class);
            //得到empMapper对象
            empMapper = sqlSession.getMapper(EmpMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   //读取数据库之后调用
    public void After(){
        //手动提交事务
        //sqlSession.commit();
        try {
            if (null != in) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
