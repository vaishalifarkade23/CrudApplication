package com.practice.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.practice.model.Emp;

public interface EmpDao
{
	public void addEmp(Emp emp);
	public List<Emp> getAllEmp();
	public void delete(int id);
	public Emp update(Emp em);
}
