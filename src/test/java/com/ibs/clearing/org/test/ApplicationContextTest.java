package com.ibs.clearing.org.test;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibs.clearing.org.service.EmployeeServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationContextTest extends AbstractJUnit4SpringContextTests {

//	public static void main(String[] args) {
//		int hash = Objects.hashCode("map");
//		int hash2 = Objects.hashCode("map2");
//		System.out.println(hash);
//		System.out.println(hash2);
//		System.out.println(hash ^ hash2);
//		System.out.println(Integer.toBinaryString(8421));
//	}
		
		
//		public static void main(String[] args) {
//			
//			Method method = BeanUtils.findMethodWithMinimalParameters(String.class.getMethods(), "substring");
//			System.out.println(method.getName() + method.getParameterCount());		
//		}	
	
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-applicationContext-service.xml");
//		EmployeeServiceImpl employeeService = (EmployeeServiceImpl) applicationContext.getBean("employeeService");
//		EmployeeDaoImpl employeeDao = (EmployeeDaoImpl) applicationContext.getBean("employeeDao");
//		employeeService.setEmployeeDao(employeeDao);
//		employeeService.getSomeMessage("EmployeeServiceImpl");
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setUuid(UUID.randomUUID().toString());
//		employee.setEmployeeId(UUID.randomUUID().toString());
//		employee.setEmployeeName("Tom");
//		employee.setEmployeeAddres("ZHENGZHOU");
//		employee.setEmployeeEmail("tom@163.com");
//		employee.setEmployeeSex(1);
//		employee.setEmployeePosition("Manager");
//		employee.setEmployeeSalary(new BigDecimal(10000.00));
//		employeeService.employeeAdd(employee);
//	}
}
