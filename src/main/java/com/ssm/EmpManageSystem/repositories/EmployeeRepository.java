package com.ssm.EmpManageSystem.repositories;

import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEnt,Integer> {

}
