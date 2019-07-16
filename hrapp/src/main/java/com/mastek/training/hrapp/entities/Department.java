package com.mastek.training.hrapp.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name="JPA")
@Component
@Scope("prototype")
public class Department implements Serializable {
	
	private int deptno;
	private String name;
	private String location;
	
	//@OneToMany: used on the get method of set to configure association
	//fetch=LAZY: delay the initialization
	//		until method getMembers() is called
	// 		using additional method [default value]
	//		EAGER: Initialize the collection on entity find
	//		Post Load event
	// cascade=All the entity operation done on Department
	//	would be performed on each associated employee object
	//	ALL: [Persist,Merge,Delete,Refresh]
	// mappedBy: identifies the propertyname in Child class
	// where the JoinColumn configuration is present
	// JoinColumn::ForeignKey
	// OnetoMany: one department can have many employees
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Set<Employee> members = new HashSet<>();
	
	
	
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
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	public Set<Employee> getMembers() {
		return members;
	}

	public void setMembers(Set<Employee> members) {
		this.members = members;
	}

	public Department() {
		
	}
}
