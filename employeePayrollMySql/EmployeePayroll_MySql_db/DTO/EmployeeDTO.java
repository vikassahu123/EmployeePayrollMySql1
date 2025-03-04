package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.DTO;

import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private String department;
    private double salary;

    // Constructor to convert Employee → EmployeeDTO
    public EmployeeDTO(Employee employee) {
        if (employee != null) {
            this.name = employee.getName();
            this.department = employee.getDepartment();
            this.salary = employee.getSalary();
        }
    }
}


    /*
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     */