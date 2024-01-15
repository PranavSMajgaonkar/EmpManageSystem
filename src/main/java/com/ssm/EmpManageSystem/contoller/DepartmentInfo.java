package com.ssm.EmpManageSystem.contoller;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.service.Department;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentInfo {


    @Autowired
    Department department;
    @PostMapping("/register_department")
    public void createDepartmentInfo(@RequestBody DepartmentEnt departmentEnt){
        System.out.println("hit post method of register department");
        department.saveDepartmentInfo(departmentEnt);
    }

    @GetMapping("/home")
    public String welcome(@PathParam("name") String name){
        System.out.println("hit welcome method");
        return "welcome use "+ name;
    }
}
