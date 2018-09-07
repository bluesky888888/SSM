package com.ibs.clearing.org.mapper;

import com.ibs.clearing.org.bean.User;

public interface UserMapper{
	
	public User selectUserByCondition(String condition);
}