package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController
{
  @Autowired
  private EmployeeService employeeService;
  
  @GetMapping("/")
  public ModelAndView home()
  {
    ModelAndView mv = new ModelAndView("home");
    return mv;
  }
  
  @GetMapping("empreg")
  public ModelAndView empreg()
  {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("empreg");
    return mv;
  }
  
  
  
  @PostMapping("insertemp")
     public ModelAndView insertemp(HttpServletRequest request)
     {
      String name = request.getParameter("ename");
      String gender = request.getParameter("egender");
      String dob = request.getParameter("edob");
      String dept = request.getParameter("edept");
      double salary = Double.parseDouble(request.getParameter("esalary"));
      String location = request.getParameter("elocation");
      String email = request.getParameter("eemail");
      String password = request.getParameter("epwd");
      String contact = request.getParameter("econtact");
      String status = "Registered";
      
        Employee emp = new Employee();
        emp.setName(name);
        emp.setGender(gender);
        emp.setDepartment(dept);
        emp.setDateofbirth(dob);
        emp.setSalary(salary);
        emp.setLocation(location);
        emp.setEmail(email);
        emp.setPassword(password);
        emp.setContact(contact);
        emp.setStatus(status);
        
        String msg = employeeService.EmployeeRegistration(emp);
        
        ModelAndView mv = new ModelAndView("regsuccess");
        mv.addObject("message", msg);
      
        return mv;
     }
  
  
    
    @GetMapping("emphome")
    public ModelAndView emphome()
    {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("emphome");
      return mv;
    }
    

    
    
    
    
    
  
  
  
    
    
    
 
   
    
   
    
     
}