package com.cheer.mybatis.dao;

import com.cheer.mybatis.model.Dept;

import java.util.List;

public interface DeptMapper {
    /**
     * 通过部门编号获得部门信息
     * @param deptno
     * @return
     */
    Dept getDept(Integer deptno);
    /**
     * 通过部门名称模糊查询
     * @param dname
     * @return
     */
    List<Dept> getDeptWithDname(String dname);
    /**
     * 通过部门地址模糊查询
     * @param loc
     * @return
     */
    List<Dept> getDeptWithLoc(String loc);
    /**
     * 获得所有部门信息
     * @return
     */
    List<Dept> getAllDept();

    /**
     * 插入dept数据
     * @param dept
     */
    void insertDept(Dept dept);

    /**
     * 通过部门编号删除部门信息
     * @param deptno
     */
    void deleteDept(Integer deptno);

    /**
     * 更新部门信息
     * @param dept
     */
    void updateDept(Dept dept);

    /**
     * 获得行数
     * @return
     */
    int rowCountDept();
}
