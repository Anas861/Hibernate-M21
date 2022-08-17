package com.cg.service;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImp;
import com.cg.entities.Employee;

public class EmployeeServiceImp implements EmployeeService 
{
	private EmployeeDao dao;
		
	public EmployeeServiceImp() {
		super();
		dao=new EmployeeDaoImp();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=dao.getEmployeeById(ID);
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		
	}
	

}
