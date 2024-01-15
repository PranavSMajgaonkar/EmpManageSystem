package com.ssm.EmpManageSystem.service;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employee {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public Employee(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public void saveEmployee(EmployeeEnt employeeEnt){
        employeeRepository.save(employeeEnt);
    }
    public List<EmployeeEnt> getList(){
       return employeeRepository.findAll();
    }
}
