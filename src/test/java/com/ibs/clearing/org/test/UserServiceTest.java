package com.ibs.clearing.org.test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.ibs.clearing.org.bean.User;
//import com.ibs.clearing.org.service.UserService;
import com.ibs.clearing.org.service.UserService;
import com.ibs.clearing.org.utils.PageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-applicationContext-dao.xml"})
public class UserServiceTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	private UserService userService;
		
	@Test
	public void testSave() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException{
//		User user = new User();
//		user.setUserName("zhangsan");
//		user.setPassword("zhangsan@123456");
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user);
//		int a = userService.insertSelective(user);
//		System.out.println(a);
	}	
	
//	@Test
//	public void testUser() {
//		String password = "123456";
//		User user = userService.selectUserByCondition(password);
//		System.out.println(user);
//	}
}
