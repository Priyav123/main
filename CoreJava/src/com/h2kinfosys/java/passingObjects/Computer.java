package com.h2kinfosys.java.passingObjects;

public class Computer {
	String type;
	int size;
	String screenResoltion;
	
	public Computer(String type , int size , String screenResoltion) {
		this.screenResoltion =screenResoltion;
		this.size = size;
		this.type = type;
	}
	
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}*/
}
