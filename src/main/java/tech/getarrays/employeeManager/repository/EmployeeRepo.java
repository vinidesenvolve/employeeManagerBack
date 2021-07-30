package tech.getarrays.employeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeeManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
}
