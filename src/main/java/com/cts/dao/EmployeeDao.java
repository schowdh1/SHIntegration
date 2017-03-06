package com.cts.dao;

import java.util.List;

import com.cts.entity.EmployeeEntity;

public interface EmployeeDao {
	
	
	public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    List<EmployeeEntity> getEmployee(Integer employeeId);
    public void deleteEmployee(Integer employeeId);

}
