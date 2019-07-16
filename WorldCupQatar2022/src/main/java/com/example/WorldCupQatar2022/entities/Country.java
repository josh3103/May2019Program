package com.example.WorldCupQatar2022.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // one copy for each test
@Entity // declares the class as an Entity
@Table(name="JPA_Country") // declaring the table name for the class

public class Country implements Serializable {
	
	
	@Value("1")
	private int countryno;
	
	@Value("England")
	private String name;
	
	@Value("")
	private 

}
