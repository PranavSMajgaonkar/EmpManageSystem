package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.service.Department;
import com.ssm.EmpManageSystem.service.Employee;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    Department department;
    @Autowired
    Employee employee;

    //register employee and department
    @PostMapping("/registration")
    public ResponseEntity<String > createDepartmentInfo(@RequestBody DepartmentEnt departmentEnt){
        List<EmployeeEnt> emp = departmentEnt.getEmployeeEntList();
        if (employee.isPresent(emp)) {
            department.saveDepartmentInfo(departmentEnt);
            return ResponseEntity.ok("Employee created successfully");
        }else
            return ResponseEntity.badRequest().body("Employee record already present");
    }

    //get all records from department.
    @GetMapping("/get_all_departments")
    public List<DepartmentEnt> welcome(@PathParam("name") String name){
        return department.getAllDepartments();
    }

    //get all records from employee.
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
}
