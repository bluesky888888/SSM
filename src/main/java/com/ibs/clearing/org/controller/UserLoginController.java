package com.ibs.clearing.org.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.clearing.org.bean.User;
import com.ibs.clearing.org.common.BaseController;

@RestController
@RequestMapping("user")
public class UserLoginController extends BaseController{
	
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public Integer userLoginCheck(@RequestBody User user){
		if (user.getUserName().equals(null) || user.getPassword().equals(null)) {
			log.info("user or password error.....");
		}	
		return 1;
	}
}
