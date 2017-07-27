package com.aisino.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aisino.domain.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Dept record);

    int insertSelective(Dept record);
    
    int insertBatchSelective(@Param("list") List<Dept> record);

    Dept selectByPrimaryKey(Integer deptId);
    
    Dept selectAll();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}