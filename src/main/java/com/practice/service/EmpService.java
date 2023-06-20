package com.practice.service;

import java.util.List;

import com.practice.model.Emp;

public interface EmpService {

	
	public void addEmp(Emp emp);
	public List<Emp> getAllEmp();
	public void delete(int id);
	public Emp update(Emp em);
}
