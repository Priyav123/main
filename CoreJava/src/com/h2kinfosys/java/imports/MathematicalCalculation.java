package com.h2kinfosys.java.imports;

import com.h2kinfosys.java.methods.Calculation;

import java.lang.System;

public class MathematicalCalculation {
	
	public static void main(String[] args) {
		String name;
		Calculation calc = new Calculation(0, 0);
		System.out.println(calc.addValue(3, 4));

		System.out.println(Calculation.subValue(4, 5));
	}
}