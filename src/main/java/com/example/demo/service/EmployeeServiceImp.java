package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
    EmployeeRepository employeeRepository ;
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	@Override
	public void save(EmployeeDTO emp) {
		Employee emp1=new Employee();
		BeanUtils.copyProperties(emp, emp1);
		employeeRepository.save(emp1);
		
	}
	@Override
	public EmployeeDTO getdetails(int idd) {
		Employee employee = employeeRepository.findById(idd).get();
		EmployeeDTO emp=new EmployeeDTO();
		BeanUtils.copyProperties(employee, emp);
		return emp;
		
	}
	
	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
		
	}
	@Override
	public void update(String name, int id) {
		employeeRepository.updateDetails(name, id);
		
	}

}
