package com.qa.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Person {
	
	String name;
	int age;
	boolean isActive;
	String roll;
	
	@Builder
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	


}
