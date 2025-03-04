package com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Repository;


import com.example.employeePayrollMySql.EmployeePayroll_MySql_db.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}