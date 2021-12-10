package com.example.Sploot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Sploot.model.Employee;
import com.example.Sploot.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // display list of employees
    @GetMapping("/")
    public List<Employee> viewHomePage() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        // save employee to database
        System.out.println(employee);
        employeeService.saveEmployee(employee);
        return employee;
    }

    @GetMapping("/updateEmployee/{id}")
    public Employee showFormForUpdate(@RequestBody Employee employee, @PathVariable(value = "id") long id) {

        // get employee from the service
//        Employee employee = employeeService.updateEmployeeId(id);
        employee.setId(id);
        employeeService.saveEmployee(employee);
        // set employee as a model attribute to pre-populate the form
//        model.addAttribute("employee", employee);
        return employee;
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.employeeService.deleteEmployeeById(id);
        return "Employee deleted successfully";
    }
}
