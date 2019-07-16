package com.mastek.training.hrapp.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.training.hrapp.entities.Department;
import com.mastek.training.hrapp.repositories.DepartmentRepository;


@Component
@Scope("singleton")
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public DepartmentService() {
		System.out.println("Department Service Created");
	}
	
	public Department registerOrUpdateDepartment(Department department) {
		department = departmentRepository.save(department);
		System.out.println("Department Registered "+department);
		return department;
	}
	
	public Department findBydepartmentId(int departmentId) {
		try {
			return departmentRepository.findById(departmentId).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public void deleteBydepartmentId(int departmentId) {
			departmentRepository.deleteById(departmentId);
			
		}	
	
}

	

