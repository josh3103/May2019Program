package com.mastek.training.hrapp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mastek.training.hrapp.apis.EmployeeService;
import com.mastek.training.hrapp.apis.ProjectService;
import com.mastek.training.hrapp.entities.Employee;
import com.mastek.training.hrapp.entities.Project;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApplicationTests {

	@Autowired
	ProjectService projectService;
	
	@Autowired
	Project project;
	
	@Test
	public void exampleProjectTest() {
		System.out.println("Project Test Case Scenarios");
		project.setProjectId(111);
		project.setName("Project 1");
		project.setCustomerName("Customer 1");
		project = projectService.registerOrUpdateProject(project);
		assertNotNull(project);
	}
	
}
