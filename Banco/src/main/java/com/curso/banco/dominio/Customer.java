package com.curso.banco.dominio;

import java.io.Serializable;

public class Customer implements Serializable {

	
	private String firstname;
	private String lastname;
	private Account cuenta;
	
	
	public Customer(String firstname, String lastname, Account cuenta) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.cuenta = cuenta;
	}

	public Customer(String firstname, String lastname ) {
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


	public Account getCuenta() {
		return cuenta;
	}


	public void setCuenta(Account cuenta) {
		this.cuenta = cuenta;
	}


	@Override
	public String toString() {
		return "Cliente " + firstname +lastname + "";
	}
	

	
}
