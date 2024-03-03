package com.example.demo.service;

import com.example.demo.DTO.EmployeeDTO;

public interface EmployeeService {

	void save(EmployeeDTO emp);

	EmployeeDTO getdetails(int idd);

	void update(String name,int id);

	void delete(int id);

}
