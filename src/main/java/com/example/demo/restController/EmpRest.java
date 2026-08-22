package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.serviceInt.ServiceInt;

@RestController
@RequestMapping("/employee")
public class EmpRest {
	@Autowired
	private ServiceInt serviceInt;


	 
	@PostMapping("/insert")
	public Employee add(@RequestBody Employee e)
	{
		System.out.println("called add");
		return serviceInt.insert(e);
		
	}
	
	@GetMapping("/get/{id}")
	public Employee get(@PathVariable int id)
	{	System.out.println("get called "+id);
		return serviceInt.get(id);
	}
}
