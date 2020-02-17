package io.github.priscillacordeiro.bank;

public class Account {
	
	private String number;
	private double balance;
	private Client client;
	
	public Account() {
	}
	
	public Account(String number, Client client) {
		this.number = number;
		this.client = client;
	}
	
	public Account(String number, double balance, Client client) {
		this.number = number;
		this.balance = balance;
		this.client = client;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public double credit(double value) {
		this.balance += value;
		return this.balance;
	}
	
	public double debit(double value) {
		if(value <= balance) {
			this.balance -= value;
			System.out.println("Debit successfully completed!");
		} else {
			System.out.println("Insufficient balance!");
		}
		return this.balance;
	}
	
	public double transfer(double value, Account destination) {
		if(value <= balance) {
			this.balance -= value;
			destination.credit(value);
			System.out.println("Transfer successfully completed!");
		} else {
			System.out.println("Insufficient balance!");
		}
		return balance;
	}
	
}