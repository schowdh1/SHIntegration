package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.EmployeeDao;
import com.cts.entity.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
	@Autowired
	EmployeeDao employeeDao;
	@Transactional
	public void addEmployee(EmployeeEntity employee) {
		employeeDao.addEmployee(employee);
		
	}

	@Transactional
	public List<EmployeeEntity> getAllEmployees() {
		
	return employeeDao.getAllEmployees();
	
	}

	@Transactional
	public void deleteEmployee(Integer employeeId) {
	employeeDao.deleteEmployee(employeeId);
		
	}
	@Transactional
	public List<EmployeeEntity> getEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee(employeeId);
	}

}
