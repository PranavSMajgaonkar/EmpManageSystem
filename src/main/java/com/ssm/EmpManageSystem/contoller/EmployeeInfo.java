package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeInfo {
    @Autowired
    Employee employee;
    @GetMapping("/getAllEmployees")
    public List<EmployeeEnt> getAllEmployees(){
       if (employee.getList().isEmpty()){
           System.out.println("is empty");
       }
       else {
           System.out.println("have record");
       }
       return employee.getList();
    }
    @PostMapping("/register_employee")
    public void createEmployee(@RequestBody EmployeeEnt employeeEnt){
        employee.saveEmployee(employeeEnt);
    }
}
