package com.ssm.contoller;

import com.ssm.repositories.DepartmentRepository;
import com.ssm.entity.DepartmentEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentInfo {

//    private final
    @Autowired
    DepartmentRepository departmentServices;

@PostMapping("/register_department")
    public void createDepartmentInfo(@RequestBody DepartmentEnt departmentEnt){
        departmentServices.save(departmentEnt);
    // departmentServices.saveDepartmentInfo(departmentEnt);
    }
}
