package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.service.Department;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentInfo {


    @Autowired
    Department department;
   /* @PostMapping("/register_department")
    public ResponseEntity<String > createDepartmentInfo(@RequestBody DepartmentEnt departmentEnt){
        department.saveDepartmentInfo(departmentEnt);
        return ResponseEntity.ok("Employee created successfully");
    }
    //get all records from department
    @GetMapping("/get_all_departments")
    public List<DepartmentEnt> welcome(@PathParam("name") String name){
        return department.getAllDepartments();
    }*/
}
