package com.curso.banco.dominio;

public class Account {

	protected double balance;

	public Account(double initBalance) {
		super();
		this.balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double cantidad) throws OverdraftException {

		

		if (this.balance >= cantidad) {
			this.balance = this.balance - cantidad;
	        } else {
	            throw new OverdraftException("Insufficient funds", Math.abs(this.balance - cantidad));
	        }

	}

	public void deposit(double cantidad) {

		this.balance = this.balance + cantidad;

	}

	

}
