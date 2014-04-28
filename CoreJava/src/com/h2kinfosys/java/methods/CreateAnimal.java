package com.h2kinfosys.java.methods;

public class CreateAnimal {

	public static void main(String[] args) {
		
		Animal pomorian = new Animal(AnimalLength.SMALL);
		Animal tiger = new Animal(AnimalLength.LARGE);
		Animal rat = new Animal(AnimalLength.MEDIUM);
		
		pomorian.printMyBehaviour();
		tiger.printMyBehaviour();
		rat.printMyBehaviour();
	}
}