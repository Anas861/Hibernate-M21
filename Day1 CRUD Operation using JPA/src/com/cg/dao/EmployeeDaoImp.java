package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImp implements EmployeeDao
{
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
	
	//default constructor
	public EmployeeDaoImp() {
		super();
		em=JPAUtil.getEntityManager();
	
	}

	@Override
	//to add=>persist(objname);
	public void addEmployee(Employee emp) 
	{
		em.persist(emp);
	}

	@Override
	//to update=>merge(objname); 
	public void updateEmployee(Employee emp) {
		em.merge(emp);
				
	}

	@Override
	public Employee getEmployeeById(int ID) {
		Employee emp=em.find(Employee.class, ID);
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		em.remove(emp);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}
	
}
