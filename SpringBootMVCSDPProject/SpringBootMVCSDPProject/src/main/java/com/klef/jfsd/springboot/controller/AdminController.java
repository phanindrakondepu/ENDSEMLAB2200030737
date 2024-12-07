package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.websocket.server.PathParam;

@Controller
public class AdminController 
{
  @Autowired
  private AdminService adminService;
  
  @Autowired
  private EmployeeService employeeService;
  
  
  
     @GetMapping("viewallemps")
     public ModelAndView viewallemps()
     {
       ModelAndView mv = new ModelAndView();
       List<Employee> emplist = adminService.ViewAllEmployees();
       mv.setViewName("viewallemps");
       mv.addObject("emplist",emplist);
       
       
       
       return mv;
     }
     
   
   

     
}