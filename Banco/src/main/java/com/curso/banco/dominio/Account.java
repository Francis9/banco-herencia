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

	public boolean sacar(double cantidad) {

		if (this.balance >= cantidad) {
			this.balance = this.balance - cantidad;
			return true;
		}

		return false;

	}

	public boolean depositar(double cantidad) {

		this.balance = this.balance + cantidad;
		return true;
	}

	

}
