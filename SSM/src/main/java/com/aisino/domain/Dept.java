package com.aisino.domain;

import org.springframework.stereotype.Component;

@Component
public class Dept {
    private Integer deptId;

    private String deptName;

    private Integer deptUpid;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptUpid() {
        return deptUpid;
    }

    public void setDeptUpid(Integer deptUpid) {
        this.deptUpid = deptUpid;
    }

	public Dept() {
		super();
	}

	public Dept(Integer deptId, String deptName, Integer deptUpid) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptUpid = deptUpid;
	}
}