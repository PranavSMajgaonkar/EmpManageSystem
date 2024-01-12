package com.ssm.service;

import com.ssm.repositories.DepartmentRepository;
import com.ssm.entity.DepartmentEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Department {
    private final DepartmentRepository departmentRepo;

@Autowired
    public Department(DepartmentRepository departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public void saveDepartmentInfo(DepartmentEnt department){
        departmentRepo.save(department);
    }
}
