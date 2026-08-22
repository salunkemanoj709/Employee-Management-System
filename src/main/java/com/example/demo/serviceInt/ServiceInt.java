package com.example.demo.serviceInt;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
 


public interface ServiceInt {
	
	Employee insert(Employee s);
	String delete();
	Employee get(int id);
	String update();

}
