package com.h2kinfosys.java.abstractinterfaceExample.reliance.clothing;

import com.h2kinfosys.java.abstractinterfaceExample.reliance.RelianceEmployee;

public class RelianceClothingEmployee extends RelianceEmployee {

	public RelianceClothingEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
	}

	@Override
	public void employmentType() {
		System.out.println(" I am Clothing Type");
	}
}