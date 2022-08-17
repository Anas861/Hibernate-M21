package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImp();
		Employee emp=new Employee();
		
		//create operation
		emp.setID(101);
		emp.setName("Anas");
		service.addEmployee(emp);
		
		

	}

}
