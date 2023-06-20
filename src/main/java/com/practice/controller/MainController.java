package com.practice.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Emp;
import com.practice.service.EmpService;

@RestController
public class MainController
{
	@Autowired
	private EmpService empService;
	
	@GetMapping("/hi")
	public String getString()
	{
		return "Welcome to SpringBoot";
	}
	
	@PostMapping("add-emp")
	public void addEmp(@RequestBody Emp emp)
	{
		empService.addEmp(emp);
	}
	 
	@GetMapping("emp-details")
	public List<Emp> getEmp()
	{
		 return empService.getAllEmp();
	}
	
	@PostMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		empService.delete(id);
	}
	
	@PutMapping("update-id")
	public void update(@RequestBody Emp emp)
	{
		empService.update(emp);
	}
	
	
}
