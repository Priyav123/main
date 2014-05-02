package com.h2kinfosys.java.classcastException;

public class Computer extends ObjectClass {
	final int i = 10;
	
	public Computer(String state) {
		super(state);
	}
	
	public void company(){
		
	}
	
	/**
	 * Final Methods cannot be overriden
	 */
	/*final void printState(){
		System.out.println("I am " + state);
	}*/
}