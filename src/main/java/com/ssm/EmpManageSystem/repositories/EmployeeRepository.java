package com.ssm.EmpManageSystem.repositories;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEnt,Integer> {

    public EmployeeEnt findByFirstNameAndEmail(String name, String email);

}
