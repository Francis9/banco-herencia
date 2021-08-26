package com.curso.banco.dominio;

public class SavingAccount extends Account {

	private double interesRate;

	public SavingAccount(double initBalance, double interesRate) {
		super(initBalance);
		this.interesRate = interesRate;
	}



}
