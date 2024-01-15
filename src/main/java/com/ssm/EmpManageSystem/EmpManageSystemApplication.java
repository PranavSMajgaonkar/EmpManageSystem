package com.ssm.EmpManageSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.ssm.EmpManageSystem"})
//@EnableJpaRepositories("com.ssm.repo")
@EntityScan("com.ssm.EmpManageSystem.entity")
public class EmpManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManageSystemApplication.class, args);
		System.out.println("Hello employee");
	}

}
