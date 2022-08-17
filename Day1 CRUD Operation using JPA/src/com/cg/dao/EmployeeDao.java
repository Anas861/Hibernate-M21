package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{
	//by default all the methods are abstract in interface
	void addEmployee(Employee emp);//creation
	void updateEmployee(Employee emp);//updation 
	Employee getEmployeeById(int ID);//Retrieve
	void removeEmployee(Employee emp);//delete
	
	void commitTransaction();
	void beginTransaction(); 
}
