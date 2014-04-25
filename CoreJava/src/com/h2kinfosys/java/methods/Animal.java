package com.h2kinfosys.java.methods;

public class Animal {
	String color;
	int length;
	String breed;
	
	public Animal(int length) {
		this.length = length;
	}
	
	
	public void printMyBehaviour(){
		if(length > 2){
			System.out.println("My Length is " + length +" I am a Big animal");
		}else {
			System.out.println("My Length is " + length +" I am a Normal Animal");
		}
	}
	/**
	 * Method OverLoading
	 * @param args
	 */
	public void printMyBehaviour(String breed){
		System.out.println("Animal.printMyBehaviour() I am String");
		/*if(length > 2 && breed == "tiger"){
			System.out.println("My Length is " + length +" I am a Big animal.....");
		}else {
			System.out.println("My Length is " + length +" I am a Normal Animal");
		}*/
		
	}
	
	public void printMyBehaviour(int breed){
		System.out.println("Animal.printMyBehaviour() I am INTEGER");
	}
	
	public static void main(String[] args) {
		Animal pomorian = new Animal(1);
		Animal tiger = new Animal(4);
		
		pomorian.printMyBehaviour(10);
		pomorian.printMyBehaviour("");
		
//		tiger.printMyBehaviour();
	}
}
