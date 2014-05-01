package com.h2kinfosys.java.methodOverriding;

public class HunterClient {

	public static void main(String[] args) {
		
		Cat bengalTiger = new Tiger("Tiger", 120 , "2");
		Cat cheeta = new Cheeta("Cheeta", 150, 40);
		
		Cheeta cheeta1 = new Cheeta("Cheeta", 150, 40);
		
//		Tiger tiger = new Cat("", 12);
		
		bengalTiger.printBehaviour();
		cheeta.printBehaviour();
		
		cheeta1.climbTree();
		
		//System.out.println(cheeta.hashCode());

//		String behaviour = cheeta.printBehave();
//		System.out.println(behaviour);
		
	}
}