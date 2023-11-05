package com.java.oops.encapsulation;

public class TestCustomer {
	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.setName("Java");
		String pwd = customer.getPassword();
		System.out.println(pwd);
		System.out.println(customer.getName());
		
	}
}
