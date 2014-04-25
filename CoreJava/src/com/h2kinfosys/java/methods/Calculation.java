package com.h2kinfosys.java.methods;

public class Calculation {
	int a;
	int b;
	public Calculation(int a , int b) {
		this.a = a;
		this.b = b;
	}
	
	public int addMe(){
//		System.out.println(a+b);
		return a+b;
	}
	
	/*public void subMe(String message) {
		System.out.println( a-b);
		
	}*/
	
	public int subMe(String message) {
		System.out.println( a-b);
		return 10;
	}
	
	public String subMe(String message , String name) {
		System.out.println( a-b);
		return "";
	}
	
	public static void main(String[] args) {
		Calculation add = new Calculation(10, 20);
//		add.add();
		int calulatedVale = add.addMe();
		int finalValue = calulatedVale + 10;
		
		System.out.println( finalValue);
		
		Calculation sub = new Calculation(10, 5);
		
	}

}
