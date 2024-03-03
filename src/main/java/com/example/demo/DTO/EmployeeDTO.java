package com.example.demo.DTO;

import jakarta.persistence.Id;

public class EmployeeDTO {

int id;
String name;
int age;
String dept;
String company;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public EmployeeDTO(int id, String name, int age, String dept, String company) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.dept = dept;
	this.company = company;
}
public EmployeeDTO() {
	
}
}

