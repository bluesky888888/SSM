package com.ibs.clearing.org.mapper;

import com.ibs.clearing.org.bean.Employee;

public interface EmployeeMapper{
	
    public Integer insert(Employee param);

    public Integer insertSelective(Employee param);

    public Integer updateByPrimaryKey(Employee param);

    public Integer updateByPrimaryKeySelective(Employee param);
    
    public Employee selectByPrimaryKey(Integer id);
}
