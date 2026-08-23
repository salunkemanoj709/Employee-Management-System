package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{

		return serviceInt.delete(id);
		
	}
	
	@GetMapping("/get/{id}")
	public Employee get(@PathVariable int id)
	{	System.out.println("get called "+id);
		return serviceInt.get(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee update(@RequestBody Employee e ,@PathVariable int id)
	{	
		return serviceInt.update(e, id);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{	
		return serviceInt.getAll();
	}
	
	@GetMapping("/findByName/{name}")
	public List<Employee> findByName(@PathVariable String name)
	{	 
		return serviceInt.findByName(name);

	}
	
	@GetMapping("/findByGender/{gender}")
	public List<Employee> findByGender(@PathVariable String gender)
	{	
		return serviceInt.findByGender(gender);
	}
}
