package com.ssm.EmpManageSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private Integer employeeId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "ContactNumber")
    private String contactNumber;
    @Column(name = "Email")
    private String email;
    @Column(name = "Address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, targetEntity = DepartmentEnt.class)
    @Column(name = "DepartmentID")
    private List<DepartmentEnt> departmentId;
    @Column(name = "Position")
    private String position;
    @Column(name = "Salary")
    private Double salary;
    @Column(name = "HireDate")
    private Date hireDate;
    @Column(name = "SupervisorId")
    private Integer supervisorId;
}
