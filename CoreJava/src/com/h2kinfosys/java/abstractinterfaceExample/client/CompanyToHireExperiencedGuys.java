package com.h2kinfosys.java.abstractinterfaceExample.client;

import com.h2kinfosys.java.abstractinterfaceExample.XYZEmployee;
import com.h2kinfosys.java.abstractinterfaceExample.reliance.clothing.RelianceClothingEmployee;

public class CompanyToHireExperiencedGuys {

	public static void main(String[] args) {
//		ABCEmployee abc = new ABCEmployee("Jayram", 30, 12345);
//		Person per = new Person("Jayram", 30, 12345);
//		abc.printPersonBehaviour();
		
		XYZEmployee xyz = new XYZEmployee("JayramXYZ", 35, 1111);
		xyz.printPersonBehaviour();
		
//		RelianceEmployee relE = new RelianceEmployee("", 12, 1212);
		RelianceClothingEmployee rce = new RelianceClothingEmployee("Dishu", 15, 12345);
		rce.employmentType();
		rce.printName();
	}
}