package com.example.WorldCupQatar2022;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WorldCupQatar2022ApplicationTests {

	@Test
	public void manageAssociations() {
		Department d1 = new Department();
		d1.setName("Admin");
		d1.setLocation("UK");
		
		Employee emp1 = new Employee();
		emp1.setName("Admin Emp 1");
		emp1.setSalary(3433);
		
		Employee emp2 = new Employee();
		emp2.setName("Admin Emp 2");
		emp2.setSalary(1000);
		
		Project p1 = new Project();
		p1.setName("UK Project");
		p1.setCustomerName("UK Customer");
		
		Project p2 = new Project();
		p2.setName("US Project");
		p2.setCustomerName("US Customer");
		
	//one to many: one department has many employees
	d1.getMembers().add(emp1);
	d1.getMembers().add(emp2);
	//many to one for each employee to assign the department
	emp.setCurrentDepartment(d1);
	emp.setCurrentDepartment(d1);
	
	//Many to many
	emp1.getAssignments().add(p2);
	emp1.getAssignments().add(p1);
	emp2.getAssignments().add(p1);
	
	deptService.registerOrUpdateDepartment(d1);
}

}
