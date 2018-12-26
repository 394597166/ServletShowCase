package com.cheer.mybatis.util;

import com.cheer.mybatis.dao.DeptMapper;
import com.cheer.mybatis.model.Dept;

import java.util.List;

public class DeptMapperImpl extends AbstractMapper implements DeptMapper {
    @Override
    public Dept getDept(Integer deptno) {
        super.Before();
        Dept dept = deptMapper.getDept(deptno);
        super.After();
        return dept;
    }

    @Override
    public List<Dept> getDeptWithDname(String dname) {
        super.Before();
        List<Dept> deptList = deptMapper.getDeptWithDname(dname);
        super.After();
        return deptList;
    }

    @Override
    public List<Dept> getDeptWithLoc(String loc) {
        super.Before();
        List<Dept> deptList = deptMapper.getDeptWithLoc(loc);
        super.After();
        return deptList;
    }

    @Override
    public List<Dept> getAllDept() {
        super.Before();
        List<Dept> deptList = deptMapper.getAllDept();
        super.After();
        return deptList;
    }

    @Override
    public void insertDept(Dept dept) {
        super.Before();
        deptMapper.insertDept(dept);
        super.After();
    }

    @Override
    public void deleteDept(Integer deptno) {
        super.Before();
        deptMapper.deleteDept(deptno);
        super.After();
    }

    @Override
    public void updateDept(Dept dept) {
        super.Before();
        deptMapper.updateDept(dept);
        super.After();
    }

    @Override
    public int rowCountDept() {
        super.Before();
        int i = deptMapper.rowCountDept();
        super.After();
        return i;
    }
}
