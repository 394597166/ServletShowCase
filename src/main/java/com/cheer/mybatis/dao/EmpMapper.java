package com.cheer.mybatis.dao;



import com.cheer.mybatis.model.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 通过员工编号获得员工信息
     * @param empno
     * @return
     */
    Emp getEmp(Integer empno);

    /**
     * 获得所有员工信息
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 插入emp数据
     * @param emp
     */
    void insertEmp(Emp emp);

    /**
     * 通过员工门编号删除员工信息
     * @param empno
     */
    void deleteEmp(Integer empno);

    /**
     * 更新部门信息
     * @param emp
     */
    void updateEmp(Emp emp);

    /**
     * 获得行数
     * @return
     */
    int rowCountEmp();
}
