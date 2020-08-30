package com.guc.uae.springbootangularemployeesms.repository;
import com.guc.uae.springbootangularemployeesms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
