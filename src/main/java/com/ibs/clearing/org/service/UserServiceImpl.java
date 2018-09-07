package com.ibs.clearing.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibs.clearing.org.bean.User;
import com.ibs.clearing.org.common.BaseServiceImpl;
import com.ibs.clearing.org.dao.IUserDao;
import com.ibs.clearing.org.dao.UserDao;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	
//	@Autowired
//	private UserDao userDao;
	
//	public void setUserDao() {
//		super.setBaseDao(this.userDao);	
//	}
	@Autowired
	private IUserDao iUserDao;
	
	public void setIUserDao() {
		super.setIBaseDao(iUserDao);
	}
}
