package com.ssm.repositories;

import com.ssm.entity.DepartmentEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEnt, Integer> {

}
