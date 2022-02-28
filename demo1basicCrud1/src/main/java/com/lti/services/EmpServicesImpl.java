package com.lti.services;

import java.util.List;

import com.lti.dao.EmpDao;
import com.lti.dao.EmpDaoImpl;
import com.lti.entity.Employee;

//Service //waiter 

public class EmpServicesImpl implements EmpServices{

	
	private EmpDao empDao;
	
	public EmpServicesImpl()
	{
		empDao= new EmpDaoImpl();
	}
	
	
	@Override
	public List<Employee> getEmpList() {
		
		System.out.println(" inside service EmpServiceImpl");
		
		return empDao.getEmpList();
		
		
	}


	@Override
	public int addEmp(Employee e) {

		return empDao.addEmp(e);
		
	}


	@Override
	public int updateEmp(int empNo, double sal) {
		// TODO Auto-generated method stub
		return 0;
	}

}
