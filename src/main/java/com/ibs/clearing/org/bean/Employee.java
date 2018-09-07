package com.ibs.clearing.org.bean;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer id;
	private String uuid;
	private String employeeId;
	private String employeeName;
	private Integer employeeSex;
	private String employeePosition;
	private BigDecimal employeeSalary;
	private String employeeEmail;
	private String employeeAddres;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid == null ? null : uuid.trim();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId == null ? null : employeeId.trim();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName == null ? null : employeeName.trim();
	}

	public Integer getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(Integer employeeSex) {
		this.employeeSex = employeeSex;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition == null ? null : employeePosition.trim();
	}

	public BigDecimal getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(BigDecimal employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
	}

	public String getEmployeeAddres() {
		return employeeAddres;
	}

	public void setEmployeeAddres(String employeeAddres) {
		this.employeeAddres = employeeAddres == null ? null : employeeAddres.trim();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", uuid=" + uuid + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", employeeSex=" + employeeSex + ", employeePosition=" + employeePosition + ", employeeSalary="
				+ employeeSalary + ", employeeEmail=" + employeeEmail + ", employeeAddres=" + employeeAddres +"]";
	}
}
