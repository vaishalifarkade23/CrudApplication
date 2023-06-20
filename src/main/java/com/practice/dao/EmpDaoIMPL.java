package com.practice.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.model.Emp;
@Repository
public class EmpDaoIMPL implements EmpDao 
{

	@Autowired 
	private EntityManager entitymanager;
	
	//save
	@Override
	public void addEmp(Emp emp)
	{
		Session session = entitymanager.unwrap(Session.class);
		session.save(emp);
	}
  //list of object
	@Override
	public List<Emp> getAllEmp() {
		Session session = entitymanager.unwrap(Session.class);
		Query query = session.createQuery("from Emp",Emp.class);
		List<Emp> list = query.getResultList();
		return list;
	}

	//delete
	@Override
	public void delete(int id) {
		Session session = entitymanager.unwrap(Session.class);
		Emp emp =(Emp)session.get(Emp.class, id);
		session.delete(emp);
	}
		
	@Override
	public Emp update(Emp em) {
		// TODO Auto-generated method stub
		Session session = entitymanager.unwrap(Session.class);
		session.update(em);
        return em;
	}
	
	
	
}
