package com.ibs.clearing.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.ibs.clearing.org.bean.Employee;
import com.ibs.clearing.org.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public Integer insert(Employee param) {
		return employeeDao.insert(param);
	}

	@Transactional
	public Integer insertSelective(Employee param) {
		return employeeDao.insertSelective(param);
	}

	@Transactional
	public Integer updateByPrimaryKey(Employee param) {
		return employeeDao.updateByPrimaryKey(param);
	}

	@Transactional
	public Integer updateByPrimaryKeySelective(Employee param) {
		return employeeDao.updateByPrimaryKeySelective(param);
	}
	
	public void getSomeMessage(String objectName) {
		System.out.println("objectName:" + objectName);
		Assert.notNull(objectName, "objectName must not be null");
	}

	@Override
	public Employee selectByPrimaryKey(Integer id) {
		return employeeDao.selectByPrimaryKey(id);
	}
}
