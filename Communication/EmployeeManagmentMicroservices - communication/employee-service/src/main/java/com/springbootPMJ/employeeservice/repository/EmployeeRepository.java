package com.springbootPMJ.employeeservice.repository;

import com.springbootPMJ.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
