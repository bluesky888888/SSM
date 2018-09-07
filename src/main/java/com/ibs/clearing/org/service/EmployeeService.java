package com.ibs.clearing.org.service;

import com.ibs.clearing.org.bean.Employee;

public interface EmployeeService{
	
    public Integer insert(Employee param);

    public Integer insertSelective(Employee param);

    public Integer updateByPrimaryKey(Employee param);

    public Integer updateByPrimaryKeySelective(Employee param);
    
    public Employee selectByPrimaryKey(Integer id);
}
