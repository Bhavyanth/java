package com.java.oops.polymorphism;

public class TestBank {
	
	public static void main(String[] args) {
		
		CentralBank cb = new BankA();
		CentralBank cb1 = new BankB();
		CentralBank cb2 = new BankC();
		
		System.out.println("Interest of Bank A "+ cb.getRateofInterest());
		System.out.println("Interest of Bank B "+ cb1.getRateofInterest());
		System.out.println("Interest of Bank C "+ cb2.getRateofInterest());
		
		
	}
}
