package com.h2kinfosys.java.extendsExample;

public class Human {
	String name;
	int height;
	String country;
	
	public void run(){
		System.out.println("I am running");
	}
	/**
	 * 
	 */
	public Human() {
		name = "Human";
		height = 10;
		country = "India";
	}
	/**
	 * One Argument constructor
	 * @param country
	 */
	public Human(String country) {
		this.country = country;
	}
	/**
	 * 
	 * @param name
	 * @param height
	 * @param country
	 */
	public Human(String name, int height , String country) {
		this.name = name ;
		this.height = height;
		this.country = country;
	}
	
	public static void main(String[] args) {
		Human h = new Human("Jayram", 6 , "USA");
		System.out.println(" "+ h.name);
	}
}
