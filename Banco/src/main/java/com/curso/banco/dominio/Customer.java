package com.curso.banco.dominio;

import java.io.Serializable;

public class Customer implements Serializable {

	private String firstname;
	private String lastname;
	private Account cuenta;
	private Account[] accounts;
	private int numberOfAccounts;

	public Customer(String firstname, String lastname, Account cuenta) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.cuenta = cuenta;
		accounts = new Account[10];
		numberOfAccounts = 0;
	}

	public Customer(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setCuenta(Account cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Cliente " + firstname + lastname + "";
	}

	public void addAccount(Account account) {
		int i = numberOfAccounts++;
		accounts[i] = account;
	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public Account getAccount(int account_index) {
		return accounts[account_index];
	}
}
