package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Transactional
	@Modifying
@Query(value="update employee set company=:company where id=:id", nativeQuery = true)
void updateDetails(@Param("company") String company,@Param("id") int id);
}
