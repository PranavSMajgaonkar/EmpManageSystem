package com.ssm.EmpManageSystem.repositories;

import com.ssm.EmpManageSystem.entity.DepartmentEnt;
import com.ssm.EmpManageSystem.entity.EmployeeEnt;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEnt, Integer> {


}
