package com.example.demo.empRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
 

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{
  //okkkk
  
    public Employee findById(int id);

	//@Query("select e from Employee e where name=':name'")
	public List<Employee> findByName(String name);
	
	//@Query("select e from Employee e where gender=':gender'")
	List<Employee> findByGender(String gender);
}
