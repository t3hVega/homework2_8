package com.homework.homework28.service;
import com.homework.homework28.model.Contract;
import com.homework.homework28.model.Employee;

import java.util.*;

public interface EmployeeService {
    Map<Contract, Employee> employees = new HashMap<>();
    String addEmployee(Integer contractNumber, String firstName, String lastName);
    String removeEmployeeByName(String firstName, String lastName);
    String findEmployeeByName(String firstName, String lastName);
}
