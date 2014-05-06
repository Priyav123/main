package com.h2kinfosys.java.abstractinterfaceExample.reliance;

import com.h2kinfosys.java.abstractinterfaceExample.Employee;

public abstract class RelianceEmployee extends Employee {

	public void printPersonBehaviour(){
		System.out.println("I am from ABC Employee" );
	}

	@Override
	public void employeeBehaviour() {
		System.out.println("I am from ABC Employee AND i work on JAVA");
	}
	
	public void employeeBehaviour(String name) {
		System.out.println("I am from ABC Employee AND i work on JAVA");
	}
	/*@Override
	public void employmentType() {
		System.out.println("I am Reliance EMPLOYEE");
	}*/
	
}