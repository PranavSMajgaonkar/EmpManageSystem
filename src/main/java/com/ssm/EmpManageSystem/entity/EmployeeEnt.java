package com.ssm.EmpManageSystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratedColumn;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.annotations.ValueGenerationType;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Employee")
public class EmployeeEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "email_id")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "employee_position")
    private String position;
    @Column(name = "employee_salary")
    private Double salary;
    @Column(name = "hire_date")
    private Date hireDate;
    @Column(name = "supervisor_id")
    private Integer supervisorId;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEnt departmentEnt;
}
