package com.h2kinfosys.java.classes;

public class Bike {
	
	int petrolLiter;
	String name;
	int length;
	
	
	/**
	 * Constructor with no argument
	 */
	public Bike(){
		this.petrolLiter = 5;
		this.name = "Bike";
		this.length = 10;
	}
	/**
	 * This is Constructor Overloading
	 * @param petrolLiter
	 */
	public Bike(int petrolLiter){
		this.petrolLiter =  petrolLiter;
	}
	
	public Bike(int petrolLiter , String name){
		this(petrolLiter);
//		this.petrolLiter = petrolLiter;
		this.name = name;
	}
	
	public Bike(int petrolLiter , String name , int length){
		this(petrolLiter, name); // Calling this class Contructor
		this.length  = length;
	}
	
}