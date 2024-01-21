package com.ssm.EmpManageSystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "Department")
public class DepartmentEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer departmentID;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "manager_id")
    private String managerId;
    @OneToMany(mappedBy = "departmentEnt", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmployeeEnt> employeeEntList;


}
