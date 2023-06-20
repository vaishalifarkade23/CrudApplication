

package com.practice.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.dao.EmpDao;
import com.practice.model.Emp;
@Service
public class EmpServiceIMPL implements EmpService {

	@Autowired
	private EmpDao empdao;
	
	//save in database
	@Transactional
	@Override
	public void addEmp(Emp emp) 
	{
		empdao.addEmp(emp);

	}

	//list of object
	@Transactional
	@Override
	public List<Emp> getAllEmp() {
		
		 return empdao.getAllEmp();
	}

	@Transactional
	@Override
	public void delete(int id) {
		empdao.delete(id);
		
	}
	@Transactional
	@Override
	public Emp update(Emp em) {
		// TODO Auto-generated method stub
		empdao.update(em);
		return em;
	}

	
	
	
	

}
