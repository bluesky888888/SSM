package com.ibs.clearing.org.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibs.clearing.org.bean.Employee;
import com.ibs.clearing.org.mapper.EmployeeMapper;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeMapper employeeMapper;

	@Transactional
	public Integer insert(Employee param) {
		return employeeMapper.insert(param);
	}

	@Transactional
	public Integer insertSelective(Employee param) {
		return employeeMapper.insertSelective(param);
	}

	@Transactional
	public Integer updateByPrimaryKey(Employee param) {
		return employeeMapper.updateByPrimaryKey(param);
	}

	@Transactional
	public Integer updateByPrimaryKeySelective(Employee param) {
		return employeeMapper.updateByPrimaryKeySelective(param);
	}

	@Override
	public Employee selectByPrimaryKey(Integer id) {
		return employeeMapper.selectByPrimaryKey(id);
	}
}
