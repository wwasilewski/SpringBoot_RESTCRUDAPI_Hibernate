package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Wojciech Wasilewski
 * @date Created on 10.07.2019
 */
// interface JpaRepository has useful methods so i do not have to create them myself
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
