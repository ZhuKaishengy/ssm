package com.aisino.domain;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Emp {
    private Integer empId;

    private String empName;

    private String empEmail;

    private Date empBirth;

    private Integer deptId;

    private Dept dept;
    
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public Date getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(Date empBirth) {
        this.empBirth = empBirth;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empBirth=" + empBirth
				+ ", deptId=" + deptId + ", dept=" + dept + "]";
	}

	public Emp(Integer empId, String empName, String empEmail, Date empBirth, Integer deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empBirth = empBirth;
		this.deptId = deptId;
	}

	public Emp() {
		super();
	}
    
}