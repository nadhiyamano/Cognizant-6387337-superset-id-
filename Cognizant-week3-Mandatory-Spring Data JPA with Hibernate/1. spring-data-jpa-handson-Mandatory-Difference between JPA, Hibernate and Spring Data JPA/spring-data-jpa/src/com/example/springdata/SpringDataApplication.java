package com.example.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springdata.model.Employee;
import com.example.springdata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Employee e = new Employee(101, "John");
        employeeService.addEmployee(e);
        System.out.println("Employee inserted using Spring Data JPA");
    }
}