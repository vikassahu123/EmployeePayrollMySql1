package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.service;

import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.DTO.EmployeeDTO;
import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Entity.Employee;

import java.util.List;
//UC-2-Service
public interface IEmployeeService {

    Employee addEmployee(EmployeeDTO employeeDTO);   //To add employee
    List<Employee> getAllEmployees();  //Get all employee details
    Employee getEmployeeById(Long id);  // Get Employee by ID
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);  // Update Employee
    void deleteEmployee(Long id);  // Delete Employee

}