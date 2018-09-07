package com.ibs.clearing.org.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.clearing.org.bean.User;
import com.ibs.clearing.org.common.BaseController;
import com.ibs.clearing.org.common.Contants;
import com.ibs.clearing.org.common.ResponseVO;
import com.ibs.clearing.org.service.UserService;

@RestController
@RequestMapping("user")
public class UserController extends BaseController{

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ResponseVO<User> getUser(@RequestParam("id")Integer id){
		User user = userService.selectByPrimaryKey(id);
		if (user == null) {
			return new ResponseVO<User>(Contants.FAILE_CODE,Contants.FAILE_MESSAGE_SELECT,user);
		} 			
		return new ResponseVO<User>(Contants.SUCCESS_CODE,Contants.SUCCESS_MESSAGE_SELECT,user);
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseVO<Integer> saveUser(@RequestBody User user,HttpServletRequest request, HttpServletResponse response){
		 int record = userService.insertSelective(user);
		if (record <= 0) {
			return new ResponseVO<Integer>(Contants.FAILE_CODE,Contants.FAILE_MESSAGE_SAVE,record);
		} 			
		return new ResponseVO<Integer>(Contants.SUCCESS_CODE,Contants.SUCCESS_MESSAGE_SAVE,record);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public ResponseVO<Integer> updateUser(@RequestBody User user){
		 int record = userService.updateByPrimaryKeySelective(user);
		if (record <= 0) {
			return new ResponseVO<Integer>(Contants.FAILE_CODE,Contants.FAILE_MESSAGE_UPDATE,record);
		} 			
		return new ResponseVO<Integer>(Contants.SUCCESS_CODE,Contants.SUCCESS_MESSAGE_UPDATE,record);
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public ResponseVO<Integer> deleteUser(@RequestParam("id")Integer id){
		 int record = userService.deleteByPrimaryKey(id);
		if (record <= 0) {
			return new ResponseVO<Integer>(Contants.FAILE_CODE,Contants.FAILE_MESSAGE_DELETE,record);
		} 			
		return new ResponseVO<Integer>(Contants.SUCCESS_CODE,Contants.SUCCESS_MESSAGE_DELETE,record);
	}
}
