package com.example.demo.serviceInt;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
 


public interface ServiceInt {
	
	Employee insert(Employee s);
	String delete(int id);
	Employee get(int id);
	Employee update(Employee old,int id);
	List<Employee> getAll();
	List<Employee> findByName(String name);
	List<Employee> findByGender(String gender);

}
