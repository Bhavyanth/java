package com.java.oops.polymorphism;

public class CentralBank {
	
	float getRateofInterest() {
		return 0;
	}
	
}


class Banks extends CentralBank{
	static float getRateOfInterest(){
		return 32.0f;
	}

	public static void main(String[] args) {
		CentralBank centralBank = new Banks(); // Upcasting
		centralBank.getRateofInterest();
	}
}
