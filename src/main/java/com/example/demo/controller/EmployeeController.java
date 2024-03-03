package com.example.demo.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImp;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	/*
	 * public EmployeeController(EmployeeRepository employeeRepo) {
	 * this.employeeService = new EmployeeServiceImp(employeeRepo); }
	 */
	@PostMapping("/create")
	public String create(@RequestBody EmployeeDTO emp) {
		employeeService.save(emp);
		return "customer saved with name " + emp.getName();
	}

	@GetMapping("/find/{id}")
	public EmployeeDTO read(@PathVariable int id, @RequestParam(name = "dept", required = false) String dept) {
		return employeeService.getdetails(id);

	}

	@PutMapping("/update")
	public String update(@RequestParam(name = "company", required = false) String company,
			@RequestParam(name = "id", required = false) int id) {
		employeeService.update(company, id);
		return "customer updated with name " + id;
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		employeeService.delete(id);
		return "deleted";
	}

}
