package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

/**
 * @author Wojciech Wasilewski
 * @date Created on 10.07.2019
 */
public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}
