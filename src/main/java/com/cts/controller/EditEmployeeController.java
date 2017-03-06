package com.cts.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Exce.CustomException;
import com.cts.Sorting.Sort;
import com.cts.entity.EmployeeEntity;
import com.cts.service.EmployeeManager;
import com.google.gson.Gson;

@Controller
public class EditEmployeeController {

@Autowired
private EmployeeManager employeemanager;


@RequestMapping(value = "/", method = RequestMethod.GET)

public String listEmployees(ModelMap map)
{
	
	 List<String> hobby=new ArrayList<String>();
		
	    hobby.add("Cricket");
	    hobby.add("Music");
	    hobby.add("Chess");
	    hobby.add("Coding");
	    map.put("hobbies", hobby);
	
	List<EmployeeEntity> sortedNames=employeemanager.getAllEmployees();
   
   
    
   // List<EmployeeEntity> al=new ArrayList<EmployeeEntity>();
    
    sortedNames=employeemanager.getAllEmployees();
    
    Collections.sort(sortedNames,new Sort());
    
   /* for(EmployeeEntity b:al)
    {
    System.out.println(b.getFirst_name());
    }*/
    
    map.addAttribute("employee", new EmployeeEntity());
  //  map.addAttribute("employeeList", employeemanager.getAllEmployees());
    map.addAttribute("employeeList", sortedNames);
    return "editEmployeeList";
}




@RequestMapping(value = "/addIt", method = RequestMethod.POST)
public String addEmployee(@ModelAttribute(value="employee") EmployeeEntity employee, BindingResult result)
{
	if(employee.getFirst_name()==null ||employee.getFirst_name().isEmpty())
	{
   try {
	throw new CustomException();
} catch (CustomException e) {
	
	e.printStackTrace();
	return "TEST";
}
	}
	else
	{
		 employeemanager.addEmployee(employee);
		    return "redirect:/";
	}


}

@RequestMapping("/delete/{employeeId}")
public String deleteEmplyee(@PathVariable("employeeId") Integer employeeId)
{
    employeemanager.deleteEmployee(employeeId);
    //return "redirect:/";
    return "redirect:/";
}


public void setEmployeeManager(EmployeeManager employeeManager) {
    this.employeemanager = employeeManager;
}
}
	

