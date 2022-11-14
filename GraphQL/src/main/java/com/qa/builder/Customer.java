package com.qa.builder;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Customer {
	String name;
	int age;
	boolean isActive;
	String roll;
	
	@Builder
	public Customer(String name , int age , boolean isActive , String roll)
	{
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.roll = roll;
	}
	
	@Builder
	public static Customer createInstance(String name , int age)
	{
		return new Customer(name , age , false , "DEVELOPER");
	}

}
