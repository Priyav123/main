package com.h2kinfosys.java.methodOverriding;

public class Cat {
	String catName;
	int speed;
	public Cat(String catName , int speed) {
		this.catName = catName;
		this.speed = speed;
	}
	public void printBehaviour() {
		System.out.println("I can RUN");
	}
}