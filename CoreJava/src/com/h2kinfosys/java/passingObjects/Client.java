package com.h2kinfosys.java.passingObjects;

public class Client {

	public static void main(String[] args) {
		Computer comp = new Computer("3", 2, "102");
		System.out.println(comp.screenResoltion);
	}
}