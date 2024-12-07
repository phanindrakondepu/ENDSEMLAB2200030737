package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public String EmployeeRegistration(Employee e) 
  {
     employeeRepository.save(e);
     return "Employee Registered Successfully";
  }

 

  

  
  
}