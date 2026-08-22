package com.example.demo.serviceImp;


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
	public String delete() {
	 
		return null;
	}
//
	@Override
	public Employee get(int id) {
		 
		return empRepo.findById(id);
		 
	}
//
	@Override
	public String update() {
		 
		return null;
	}

}
