package com.ssm.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Department")
public class DepartmentEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer DepartmentID;
    private String DepartmentName;
    private String ManagerID;

}
