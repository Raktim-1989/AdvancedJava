package com.qa.demo;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer("tom" , 20 , "NY" , true , "19-03-2021");
//		c1.setName("Raktim");
//		c1.getName();
		System.out.println(c1.getName() + " "  + c1.getDob());
		
		
	}

}
