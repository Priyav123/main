package com.h2kinfosys.java.methodOverriding;

public class Tiger extends Cat {
	String stripeThickness;
	public Tiger(String catName , int speed , String stripeThickness) {
		super(catName , speed);
		this.stripeThickness = stripeThickness;
	}
}
