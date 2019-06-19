package com.cg.eis.service;
import java.util.*;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	static Map<Integer,Employee> emp=new HashMap<Integer,Employee>();

	@Override
	public boolean addEmployee(Employee ob) {
		// TODO Auto-generated method stub
		emp.put(ob.getId(),ob);
		return true;
	}

	
	public Employee findScheme(int id) {
		// TODO Auto-generated method stub
		Employee ob=emp.get(id);
		return ob;
	}

	@Override
	public Map<Integer, Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emp;
	}


	@Override
	public boolean findScheme(Employee ob) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
