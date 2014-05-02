package com.h2kinfosys.java.classcastException;

public class ClassCastClient {

	public static void main(String[] args) {
		ObjectClass objectClass1 = new Computer("Non Living");
		ObjectClass objectClass2 = new Fish("Living");
		((Fish)objectClass1).smimming();
	}
}