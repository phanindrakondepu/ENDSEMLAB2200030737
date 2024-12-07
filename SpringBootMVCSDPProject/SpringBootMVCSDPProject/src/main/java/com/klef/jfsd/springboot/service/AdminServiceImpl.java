package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService
{
  @Autowired
  private EmployeeRepository employeeRepository;
  
  
  
  @Autowired
  private AdminRepository adminRepository;
  
  
  public List<Employee> ViewAllEmployees()
  {
    return employeeRepository.findAll();
  }

  
  


 
  
  

  
 

  
  
  

}