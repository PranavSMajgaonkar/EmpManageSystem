package com.ssm.contoller;

import com.ssm.entity.EmployeeEnt;
import com.ssm.repositories.EmployeeRepository;
import com.ssm.service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeInfo {
   /* Employee employee;
    @GetMapping("/getAllEmployees")
    public List<EmployeeEnt> getAllEmployees(){
        return employee.getList();
    }
    @PostMapping("/register_employee")
    public void createEmployee(@RequestBody EmployeeEnt employeeEnt){
        employee.saveEmployee(employeeEnt);
    }*/
}
