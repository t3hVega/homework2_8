package com.homework.homework28.controller;

import com.homework.homework28.model.Contract;
import com.homework.homework28.model.Employee;
import com.homework.homework28.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public String add(
            @RequestParam("contractNumber") Integer contractNumber,
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
        return employeeService.addEmployee(contractNumber ,firstName, lastName);
    }
    @GetMapping("/remove")
    public String remove(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
        return employeeService.removeEmployeeByName(firstName, lastName);
    }
    @GetMapping("/find")
    public String find(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName
    ) {
        return employeeService.findEmployeeByName(firstName, lastName);
    }
    @GetMapping("/list")
    public Map<Contract, Employee> list() {
        return employeeService.employees;
    }
}
