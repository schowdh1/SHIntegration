package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.EmployeeEntity;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionfactory;
	
	public void addEmployee(EmployeeEntity employee) {

		this.sessionfactory.getCurrentSession().save(employee);
		
	}

	
	@SuppressWarnings("unchecked")
	public List<EmployeeEntity> getAllEmployees() {
		
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		employeeList = this.sessionfactory.getCurrentSession().createQuery("from EmployeeEntity").list();
		
	return employeeList;
	
	}
@SuppressWarnings("unchecked")
public List<EmployeeEntity> getEmployee(Integer employeeId) {
		
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		employeeList = this.sessionfactory.getCurrentSession().createQuery("from EmployeeEntity where id = :employeeId").list();
		
	return employeeList;
}
	public void deleteEmployee(Integer employeeId) {
		EmployeeEntity employee = (EmployeeEntity) sessionfactory.getCurrentSession().load(
                EmployeeEntity.class, employeeId);
		
	 if(employee!=null)
	 {
		this.sessionfactory.getCurrentSession().delete(employee);
	 }
		//this.sessionfactory.getCurrentSession().delete(employeeId);
		
	}

}
