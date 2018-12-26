package com.cheer.mybatis.model;

import java.util.StringJoiner;

public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private String hiredate;
    private Double sal;
    private Double com;
    private Integer deptno;

    public Emp() {
    }

    public Emp(Integer empno, String ename, String job, Integer mgr, String hiredate, Double sal, Double com, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.com = com;
        this.deptno = deptno;
    }

    public Integer getEmpno() {
        return empno;
    }

    public Emp setEmpno(Integer empno) {
        this.empno = empno;
        return this;
    }

    public String getEname() {
        return ename;
    }

    public Emp setEname(String ename) {
        this.ename = ename;
        return this;
    }

    public String getJob() {
        return job;
    }

    public Emp setJob(String job) {
        this.job = job;
        return this;
    }

    public Integer getMgr() {
        return mgr;
    }

    public Emp setMgr(Integer mgr) {
        this.mgr = mgr;
        return this;
    }

    public String getHiredate() {
        return hiredate;
    }

    public Emp setHiredate(String hiredate) {
        this.hiredate = hiredate;
        return this;
    }

    public Double getSal() {
        return sal;
    }

    public Emp setSal(Double sal) {
        this.sal = sal;
        return this;
    }

    public Double getCom() {
        return com;
    }

    public Emp setCom(Double com) {
        this.com = com;
        return this;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public Emp setDeptno(Integer deptno) {
        this.deptno = deptno;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Emp.class.getSimpleName() + "[", "]")
                .add("empno=" + empno)
                .add("ename='" + ename + "'")
                .add("job='" + job + "'")
                .add("mgr=" + mgr)
                .add("hiredate='" + hiredate + "'")
                .add("sal=" + sal)
                .add("com=" + com)
                .add("deptno=" + deptno)
                .toString();
    }
}
