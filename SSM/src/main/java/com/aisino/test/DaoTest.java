package com.aisino.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aisino.dao.DeptMapper;
import com.aisino.dao.EmpMapper;
import com.aisino.domain.Dept;
import com.aisino.domain.Emp;
/**
 * spring 的单元测试
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DaoTest {

	@Autowired
	DeptMapper deptMapper;
	@Autowired
	EmpMapper empMapper;
	@Autowired
	Dept dept;
	@Autowired
	Emp emp;
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Test
	public void testSpringRunner(){
		System.out.println(deptMapper);
	}
	@Test
	public void testDept(){
		dept = new Dept(null, "研发部", null);
		deptMapper.insertSelective(dept);
	}
	@Test
	public void testEmpInsert() throws ParseException{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse("1994-06-20");
		emp = new Emp(1, "zhukaisheng", "zhukaisheng@aisino.com", date, 1);
		empMapper.insertSelective(emp);
	}
	
	@Test
	public void testEmpSelect(){
		Emp emp2 = empMapper.selectByPrimaryKey(1);
		System.out.println(emp2);
	}
	@Test
	public void testEmpSelect2(){
		Emp d = empMapper.selectByPrimaryKeyWithDept(1);
		System.out.println(d.getDept().getDeptName());
	}
	@Test
	public void testBatchInsert(){
		String str = UUID.randomUUID().toString();
		Dept dept1 = new Dept(null, "研发部", null); 
		Dept dept2 = new Dept(null, "测试部", null); 
		DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
		mapper.insertSelective(dept1);
		mapper.insertSelective(dept2);
	}

}
