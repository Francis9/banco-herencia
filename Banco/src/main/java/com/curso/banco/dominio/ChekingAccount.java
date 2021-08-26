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

	 
	    public void withdraw(double amt) throws OverdraftException {
	        if (amt > 0 && this.balance - amt >= 0 - this.overdraftAmount) {
	            if (this.balance - amt < 0) {
	                this.overdraftAmount += this.balance - amt;;
	                this.balance = 0;
	            } else {
	                this.balance = this.balance - amt;
	            }
	        } else {
	            throw new OverdraftException(" Insufficient funds for overdraft protection!", Math.abs(this.balance - amt));
	        }

	    }

	

}
