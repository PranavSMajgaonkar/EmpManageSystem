package com.ssm.EmpManageSystem.service;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
//        List<EmployeeEnt> elist = null;
        //list of emails from body
        List<EmployeeEnt> newList = new java.util.ArrayList<>(employeeEnt.stream().toList());
        /*List<String> email = employeeEnt.stream()
                .map(EmployeeEnt::getEmail)
                .toList();*/
        //list of emails which is present in record
        List<EmployeeEnt> existList = employeeRepository.findAll();
        if (!newList.isEmpty()) {
            for (EmployeeEnt newOne : newList) {         //new 2 records
                for (EmployeeEnt existOne : existList) { //existing 10 records
                    if (existOne.getFirstName().equals(newOne.getFirstName())
                            && existOne.getLastName().equals(newOne.getLastName())
                            && existOne.getEmail().equals(newOne.getEmail())) {
                        noRecord = false;
                        break;
                    } else {
                        noRecord = true;
                    }
                }
                newList.remove(newOne);
            }
        }
//        for (String e : email)
//            elist = employeeRepository.findByEmail(e);

        //iterate on both list and check is record present in db using email. if no save record else don't save
        /*assert elist != null;
        for (EmployeeEnt existingOne : elist) {
            for (String newOne : email)
                if(newOne.equals(existingOne.getEmail()))
                    return noRecord = false;
        }*/
        return noRecord;
    }
    public void saveEmployee(EmployeeEnt employeeEnt){
        employeeRepository.save(employeeEnt);
    }
    public List<EmployeeEnt> getList(){
       return employeeRepository.findAll();
    }

}
