package com.ssm.EmpManageSystem;

import com.ssm.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = "com.ssm")
public class EmpManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManageSystemApplication.class, args);
		System.out.println("Hello employee");
		Date d1 = new Date(2000,05,02);
		Date d2 = new Date(2015,05,02);
		Employee employeeOne = new Employee(1,"ssm","root",
				d1,"male",
				"8989","abc@gmail.com","xyz",19,"developer",
				 50.0000,d2,10);
		System.out.println(employeeOne.toString());
	}

}
