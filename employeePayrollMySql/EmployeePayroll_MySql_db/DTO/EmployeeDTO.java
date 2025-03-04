package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.DTO;

public class EmployeeDTO {
    public String name;
    public String department;
    public double salary;

    //Constructor
    public EmployeeDTO(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary ;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

}