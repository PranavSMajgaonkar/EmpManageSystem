package com.ssm.EmpManageSystem.service;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Employee {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public Employee(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean isPresent(List<EmployeeEnt> employeeEnt){
        boolean noRecord = true;
        List<EmployeeEnt> elist = null;

        List<String> email = employeeEnt.stream()
                .map(EmployeeEnt::getEmail)
                .toList();

        for (String e : email)
            elist = employeeRepository.findByEmail(e);

        assert elist != null;
        for (EmployeeEnt existingOne : elist) {
            for (EmployeeEnt newOne : employeeEnt)
                if(newOne.getEmail().equals(existingOne.getEmail()))
                    return noRecord = false;
        }
        return noRecord;
    }
    public void saveEmployee(EmployeeEnt employeeEnt){
        employeeRepository.save(employeeEnt);
    }
    public List<EmployeeEnt> getList(){
       return employeeRepository.findAll();
    }

}
