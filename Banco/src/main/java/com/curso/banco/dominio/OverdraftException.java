package com.curso.banco.dominio;

public class OverdraftException extends Exception {

	private double deficit;
	
	public OverdraftException(String mensaje , Double deficit) {
		super(mensaje);
		this.deficit = deficit;
		
	}

	public double getDeficit() {
		return deficit;
	}
	
	
}
