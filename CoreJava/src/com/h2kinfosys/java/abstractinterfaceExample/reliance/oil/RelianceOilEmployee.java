package com.h2kinfosys.java.abstractinterfaceExample.reliance.oil;

import com.h2kinfosys.java.abstractinterfaceExample.interfaces.Jumpable;
import com.h2kinfosys.java.abstractinterfaceExample.reliance.RelianceEmployee;

public class RelianceOilEmployee extends RelianceEmployee {

	public RelianceOilEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
	}

	@Override
	public void employmentType() {
	}
	
	public void oilEmployeeBehaviour() {
		System.out.println("I am OIL Employee");
	}

	@Override
	public void relianceShare() {
		
	}

	@Override
	public void jumpBehaviour() {
		System.out.println("I am rel Oil Emp who can jump also");
	}

	@Override
	public void callMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void singGoodMusic() {
		// TODO Auto-generated method stub
		
	}

}