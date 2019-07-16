package com.mastek.training.hrapp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mastek.training.hrapp.apis.DepartmentService;
import com.mastek.training.hrapp.entities.Department;

public class DepartmentApplicationTests {
	

	@Autowired
	DepartmentService deptService;
	
	@Autowired
	Department department;
	
	@Test
	public void exampleDepartmentTest() {
		System.out.println("Department Test Case Scenarios");
		department.setDeptno(133);
		department.setName("Dep 1");
		department.setLocation("Glasgow");
		department = deptService.registerOrUpdateDepartment(department);
		assertNotNull(department);
	}
}
