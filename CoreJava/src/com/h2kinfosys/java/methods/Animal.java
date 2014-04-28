package com.h2kinfosys.java.methods;

public class Animal {
	String color;
	AnimalLength length;
	String breed;
	
	/*public Animal(){
		
	}
	
	*/
	public Animal(AnimalLength size) {
		this.length = size;
	}
	
	
	public void printMyBehaviour(){
		
		if(AnimalLength.SMALL == length){
			System.out.println("My Length is " + length +" I am a Pomorian Animal");
		}else if(AnimalLength.MEDIUM == length){
			System.out.println("My Length is " + length +" I am a Rat Animal");
		}else if(AnimalLength.MEDIUM == length) {
			System.out.println("My Length is " + length +" I am a Tiger Animal");
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
		
/*		Animal pomorian = new Animal(1);
		Animal tiger = new Animal(3);
*/		
//		pomorian.printMyBehaviour();
//		pomorian.printMyBehaviour();
		
//		tiger.printMyBehaviour();
	}
}
