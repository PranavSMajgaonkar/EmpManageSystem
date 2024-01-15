package com.ssm.EmpManageSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private int employeeId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String contactNumber;
    private String email;
    private String address;
    private int departmentId;
    private String position;
    private double salary;
    private Date hireDate;
    private int supervisorId;

}
