package com.h2kinfosys.java.classes;

public class BikeClient {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		System.out.println("Bike.main()" + bike1.petrolLiter);
		
		Bike bike2 = new Bike(10);
		System.out.println("Bike.main()" + bike2.petrolLiter);
		
		Bike hondaBike = new Bike(15 , "Honda");
		System.out.println("Bike.main()" + hondaBike.petrolLiter +" " + hondaBike.name);
		
		Bike hondaBike10 = new Bike(15 , "Honda" , 10);
		System.out.println("Bike.main()" + hondaBike10.petrolLiter +" "
				+ " " + hondaBike10.name + " "
				+ " "+ hondaBike10.length );
	}
}