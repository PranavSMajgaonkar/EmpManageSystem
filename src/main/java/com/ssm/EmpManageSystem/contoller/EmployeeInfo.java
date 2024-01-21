package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.service.Employee;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeInfo {
    @Autowired
    Employee employee;
    /*@GetMapping("/getAllEmployees")
    public List<EmployeeEnt> getAllEmployees(){
       if (employee.getList().isEmpty()){
           System.out.println("is empty");
       }
       else {
           System.out.println("have record");
       }
       return employee.getList();
    }*/
    /*@PostMapping("/register_employee")
    public String  createEmployee(@RequestBody EmployeeEnt employeeEnt){
        boolean isMatch = employee.getList().stream()
                        .anyMatch(e->e.getEmployeeId().equals(employeeEnt.getEmployeeId()));
        if (isMatch){
            System.out.println("record already present");
            return "have record";
        }
        else {
            employee.saveEmployee(employeeEnt);
            return "register employee";
        }
    }*/
}
