package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.control;


import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Entity.Employee;
import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeControl {

    private final EmployeeRepository employeeRepository;

    public EmployeeControl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //Get (Fetching all employees)
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //Post (Adding new Employees)
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    //Put (Updating Employees in Employee via ID
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(employeeDetails.getName());
            employee.setDepartment(employeeDetails.getDepartment());
            employee.setSalary(employeeDetails.getSalary());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    //Delete Deleting employees by Id
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return "Employee with Id: " + id + " deleted successfully";
    }
}