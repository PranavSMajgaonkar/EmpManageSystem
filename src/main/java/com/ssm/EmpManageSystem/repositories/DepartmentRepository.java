package com.ssm.EmpManageSystem.repositories;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEnt, Integer> {

}
