package com.h2kinfosys.java.threads.sync;

class Account {
	private int balance = 50;
	public int getBalance() {
		return balance;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}