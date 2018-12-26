package com.cheer.mybatis.model;

import java.util.StringJoiner;

public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public Dept setDeptno(Integer deptno) {
        this.deptno = deptno;
        return this;
    }

    public String getDname() {
        return dname;
    }

    public Dept setDname(String dname) {
        this.dname = dname;
        return this;
    }

    public String getLoc() {
        return loc;
    }

    public Dept setLoc(String loc) {
        this.loc = loc;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dept{");
        sb.append("deptno=").append(deptno);
        sb.append(", dname='").append(dname).append('\'');
        sb.append(", loc='").append(loc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
