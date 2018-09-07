package com.ibs.clearing.org.test;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibs.clearing.org.bean.Employee;
import com.ibs.clearing.org.service.EmployeeServiceImpl;

@ContextConfiguration(locations = {"classpath:spring-applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class IBSClearingTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private EmployeeServiceImpl employeeService;
	

//	@SuppressWarnings("resource")
//	@BeforeClass
//	public static void init() {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-applicationContext-service.xml");
//		employeeService = (EmployeeServiceImpl) applicationContext.getBean("employeeService");
//	}
	
	@Test
	public void selective() {
			
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setUuid(UUID.randomUUID().toString().substring(0, 10));
		employee.setEmployeeId(UUID.randomUUID().toString().substring(0, 10));
		employee.setEmployeeName("张三");
		employee.setEmployeeAddres("郑州");
		employee.setEmployeeEmail("zhangsan@163.com");
		employee.setEmployeeSex(1);
		employee.setEmployeePosition("Manager");
		employee.setEmployeeSalary(new BigDecimal(10000.00));
		employeeService.insert(employee);
//		Employee emp = this.employeeService.selectByPrimaryKey(0);
//		System.out.println(emp);
	}
	
//	@Test
//	public void selectTest() {
//		Employee employee = employeeService.selectByPrimaryKey(1);
//		System.out.println(employee);
//	}
}
