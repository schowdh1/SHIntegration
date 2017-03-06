package com.cts.Sorting;

import java.util.Comparator;

import com.cts.entity.EmployeeEntity;

public class Sort implements Comparator<EmployeeEntity>{

	public int compare(EmployeeEntity arg0, EmployeeEntity arg1) {
		
		//return arg1.getFirst_name().compareToIgnoreCase(arg0.getFirst_name());
		return arg1.getLast_name().compareToIgnoreCase(arg0.getLast_name());
	}

}
