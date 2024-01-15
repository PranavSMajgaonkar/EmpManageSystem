package com.ssm.EmpManageSystem.service;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Department {

    private final DepartmentRepository departmentRepository;
    @Autowired
    public Department(DepartmentRepository departmentRepository) {
        System.out.println("flow goes into this");
        this.departmentRepository = departmentRepository;
    }
    public void saveDepartmentInfo(DepartmentEnt department){
        departmentRepository.save(department);
    }
}
