package com.ibs.clearing.org.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.ibs.clearing.org.bean.User;
import com.ibs.clearing.org.common.BaseDao;

@Repository("userDao")
public class UserDao extends BaseDao<User,Serializable> implements IUserDao{

	private static final long serialVersionUID = 4957557690867123777L;	
}
