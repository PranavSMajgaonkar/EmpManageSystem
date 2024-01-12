package com.ssm.EmpManageSystem;

import com.ssm.model.EmployeeDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication
//@EnableAutoConfiguration
//@EnableJpaRepositories
@ComponentScan(basePackages = "com.ssm")
public class EmpManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManageSystemApplication.class, args);
	}

}
