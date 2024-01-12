package com.ssm.service;

import com.ssm.repositories.EmployeeRepository;
import com.ssm.entity.EmployeeEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee {
    private final EmployeeRepository empRepo;

@Autowired
    public Employee(EmployeeRepository employeeRepository) {
        this.empRepo = employeeRepository;
    }

    public void saveEmployee(EmployeeEnt employeeEnt){
        empRepo.save(employeeEnt);
    }
    public List<EmployeeEnt> getList(){
       return empRepo.findAll();
    }
}
