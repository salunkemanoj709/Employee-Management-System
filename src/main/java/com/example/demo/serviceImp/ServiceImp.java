package com.example.demo.serviceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.empRepo.EmpRepo;
import com.example.demo.entity.Employee;
 
import com.example.demo.serviceInt.ServiceInt;
 

@Service
public class ServiceImp implements ServiceInt{
    
	@Autowired
	private EmpRepo empRepo;


	@Override
	public Employee insert(Employee e) {
		 
	    empRepo.save(e);
		return e;
	}

	@Override
	public String delete(int id) {
	 
		Employee e=empRepo.findById(id);
		empRepo.delete(e);
		return "deleted successfully";
	}
//
	@Override
	public Employee get(int id) {
		 
		return empRepo.findById(id);
		 
	}

	@Override
	public Employee update(Employee newE,int id) {
		 
		Employee old = empRepo.findById(id);
		old.setName(newE.getName());
		old.setAddress(newE.getAddress());
		old.setAge(newE.getAge());
		old.setDepartment(newE.getDepartment());
		old.setDesignation(newE.getDesignation());
		old.setEmail(newE.getEmail());
		old.setGender(newE.getGender());
		old.setPhone(newE.getPhone());
		old.setSalary(newE.getSalary());
		
		empRepo.save(old);
		return old;
	}

	@Override
	public List<Employee> getAll() {
		
		return empRepo.findAll();
	}

	@Override
	public List<Employee> findByName(String name) {
		System.out.println(empRepo.findByName(name));
		return empRepo.findByName(name);
	}

	@Override
	public List<Employee> findByGender(String gender) {
		
		return empRepo.findByGender(gender);
	}
	
}
