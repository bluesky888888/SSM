package com.ibs.clearing.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.clearing.org.bean.Employee;
import com.ibs.clearing.org.common.BaseController;
import com.ibs.clearing.org.common.Contants;
import com.ibs.clearing.org.common.ResponseVO;
import com.ibs.clearing.org.service.EmployeeService;

@RestController
@RequestMapping(value="employee")
public class EmployeeController extends BaseController{
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/empsave", method=RequestMethod.POST)
	public ResponseVO<Integer> employeeSave(Employee employee) {
		int record = employeeService.insert(employee);
		if (record <= 0) { 
			log.error("EmployeeController:employeeSave insert error.");
			return new ResponseVO<Integer>(Contants.FAILE_CODE, Contants.FAILE_MESSAGE_SAVE, record);
		}
		return new ResponseVO<Integer>(Contants.SUCCESS_CODE, Contants.SUCCESS_MESSAGE_SAVE, record);
	}

	@RequestMapping(value="/select", method=RequestMethod.GET)
	public ResponseVO<Employee> selectByPrimaryKey(@RequestParam("id")Integer id) {
		Employee record = employeeService.selectByPrimaryKey(id);
		if (record == null) {
			log.error("EmployeeController:selectByPrimaryKey select error.");
			return new ResponseVO<Employee>(Contants.FAILE_CODE, Contants.FAILE_MESSAGE_SELECT, record); 	
		}
		return new ResponseVO<Employee>(Contants.SUCCESS_CODE, Contants.SUCCESS_MESSAGE_SELECT, record);
	}
}
