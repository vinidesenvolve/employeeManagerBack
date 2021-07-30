package tech.getarrays.employeeManager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeeManager.exception.UserNotFoundException;
import tech.getarrays.employeeManager.model.Employee;
import tech.getarrays.employeeManager.repository.EmployeeRepo;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id:" + id + " was not found!"));
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }
}
