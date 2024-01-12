package com.ssm.repositories;

import com.ssm.entity.EmployeeEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEnt,Integer> {

}
