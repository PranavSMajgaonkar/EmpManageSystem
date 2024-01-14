package com.ssm.EmpManageSystem;

import com.ssm.model.EmployeeDto;
import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.ssm"})
@EnableJpaRepositories("com.ssm.repositories")
@EntityScan("com.ssm.entity")
public class EmpManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManageSystemApplication.class, args);
		System.out.println("Hello employee");
	}

}
