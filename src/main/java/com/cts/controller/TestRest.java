package com.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cts.entity.EmployeeEntity;
import com.cts.service.EmployeeManager;
import com.google.gson.Gson;

@Controller
public class TestRest {
	
	
	@Autowired
	private EmployeeManager employeemanager;
	 List<EmployeeEntity> al=new ArrayList<EmployeeEntity>();
	 
	
	
	@RequestMapping(value = "/getEmp", method = RequestMethod.POST)
    public String  listEmployees1(ModelMap model)
	{
		
		
		Gson gson = new Gson();
		//al=employeemanager.getAllEmployees();
		
	
		//String json = gson.toJson(employeemanager.getAllEmployees());
		String json = gson.toJson(employeemanager.getAllEmployees());
	
		System.out.println(json);
	    //map.addAttribute("employee", new EmployeeEntity());
	    //return "TEST";
		model.addAttribute("json", json);
		return "Registartion";
	}


}
