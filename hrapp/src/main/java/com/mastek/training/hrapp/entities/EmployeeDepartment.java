package com.mastek.training.hrapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
@Entity
@Table(name="JPA_Department")
@NamedQueries({
	@NamedQuery(name="Department.findByLocation",
			query="select d from department d where d.location between :min and :max")
	
})




public class EmployeeDepartment implements Serializable {
		
		@Value("-1")
		private int deptno;
		
		@Value("")
		private String name;
		
		@Value("")
		private String location;
		
		
		public EmployeeDepartment() {
		System.out.println("");	
		}
		

		public int getDeptno() {
			return deptno;
		}

		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
		
		
		
		
		
		
	}


