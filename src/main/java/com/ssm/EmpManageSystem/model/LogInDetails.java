package com.ssm.EmpManageSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LogInDetails {
    private String userName;
    private String password;

}
