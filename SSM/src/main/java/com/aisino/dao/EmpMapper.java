package com.aisino.dao;

import com.aisino.domain.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empId);
    
    Emp selectByPrimaryKeyWithDept(Integer empId);
    
    Emp selectAllWithDept();

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}