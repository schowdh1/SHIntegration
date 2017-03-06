package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
@Id
@GeneratedValue
private Integer id;
@Column(name="FIRST_NAME")
private String first_name;

@Column(name="LAST_NAME",unique=true)
private String last_name;
@Column(name="Interest")

private String interest;


public String getInterest() {
	return interest;
}
public void setInterest(String interest) {
	this.interest = interest;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}



}
