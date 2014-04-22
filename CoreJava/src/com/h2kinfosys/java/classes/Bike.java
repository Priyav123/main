package com.h2kinfosys.java.classes;

public class Bike {
	
	int petrolLiter;
	
	/**
	 * 
	 */
	public Bike(){
		petrolLiter = 20;
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println("Bike.main()" + bike.petrolLiter);
		
		Bike bike2 = new Bike();
		System.out.println("Bike.main()" + bike2.petrolLiter);
		
		Bike bike3 = new Bike();
		System.out.println("Bike.main()" + bike3.petrolLiter);
	}

}
