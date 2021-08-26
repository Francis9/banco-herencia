package com.curso.banco.dominio;

public class ChekingAccount extends Account{

	private double overdraftAmount;

	public ChekingAccount(double initBalance, double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}
	
	
	public ChekingAccount(double initBalance) {
		this(initBalance, 0.0);
	}

	public boolean sacar(double amount) {
		boolean result = true;

		if (balance < amount) {
			double overdraftNeeded = amount - balance;
			if (overdraftAmount < overdraftNeeded) {
				result = false;
			} else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;
			}
		} else {
			balance -= amount;
		}
		return result;
	}

	

}
