package com.cheer.mybatis.util;

import com.cheer.mybatis.dao.EmpMapper;
import com.cheer.mybatis.model.Emp;

import java.util.List;

public class EmpMapperImpl extends AbstractMapper implements EmpMapper {
    @Override
    public Emp getEmp(Integer empno) {
        super.Before();
        Emp emp = empMapper.getEmp(empno);
        super.After();
        return emp;
    }

    @Override
    public List<Emp> getAllEmp() {
        super.Before();
        List<Emp> empList = empMapper.getAllEmp();
        super.After();
        return empList;
    }

    @Override
    public void insertEmp(Emp emp) {
        super.Before();
        empMapper.insertEmp(emp);
        super.After();
    }

    @Override
    public void deleteEmp(Integer empno) {
        super.Before();
        empMapper.deleteEmp(empno);
        super.After();
    }

    @Override
    public void updateEmp(Emp emp) {
        super.Before();
        empMapper.updateEmp(emp);
        super.After();
    }

    @Override
    public int rowCountEmp() {
        super.Before();
        int i = empMapper.rowCountEmp();
        super.After();
        return i;
    }
}
