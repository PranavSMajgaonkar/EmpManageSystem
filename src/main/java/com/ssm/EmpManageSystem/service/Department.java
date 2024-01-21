package com.ssm.EmpManageSystem.service;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import com.ssm.EmpManageSystem.repositories.DepartmentRepository;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class Department {

    private final DepartmentRepository departmentRepository;
    @Autowired
    public Department(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public void saveDepartmentInfo(DepartmentEnt department){
        departmentRepository.save(department);
    }
    public List<DepartmentEnt> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
