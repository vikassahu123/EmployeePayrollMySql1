package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Entity;


import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private double salary;

    // Constructor using DTO
    public Employee(EmployeeDTO employeeDTO) {
        if (employeeDTO != null) {
            this.name = employeeDTO.getName();
            this.department = employeeDTO.getDepartment();
            this.salary = employeeDTO.getSalary();
        }
    }
}

/*
    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 */