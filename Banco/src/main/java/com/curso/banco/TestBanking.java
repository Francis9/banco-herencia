package com.curso.banco;

import com.curso.banco.dominio.Account;
import com.curso.banco.dominio.ChekingAccount;
import com.curso.banco.dominio.Customer;
import com.curso.banco.dominio.SavingAccount;

public class TestBanking {
	public static void main(String[] args) {

		// CLiente1
		System.out.println("Creando usuario Jane Smith");
		Customer cliente1 = new Customer("Jane ", "Smith");
		System.out.println("Creando cuenta SaveAccount Jane Smith");
		SavingAccount cuenta1 = new SavingAccount(500, 3);
		cliente1.addAccount(cuenta1);

		// CLiente2
		System.out.println("Creando usuario Owen Bryant");
		System.out.println("Creando cuenta CustomerAaccount Owen Bryant");
		Customer cliente2 = new Customer("Owen ", "Bryant");
		System.out.println("Creando cuenta ChekingAccount Owen Bryant");
		ChekingAccount cuenta2 = new ChekingAccount(500);
		cliente2.addAccount(cuenta2);

		// CLiente3
		System.out.println("Creando usuario Tim Soley");
		Customer cliente3 = new Customer("Tim ", "Soley");
		ChekingAccount cuenta3 = new ChekingAccount(500, 500);
		cliente3.addAccount(cuenta3);
		// CLiente4
		System.out.println("Creando usuario Maria Soley");
		Customer cliente4 = new Customer("Maria ", "Soley");
		cliente4.addAccount(cuenta3);

		// Movimientos cliente1

		System.out.println("Withdraw 150 : " + cuenta1.sacar(150));
		System.out.println("Deposit 22.50 : " + cuenta1.depositar(22.50));
		System.out.println("Withdraw 47.62 : " + cuenta1.sacar(47.62));
		System.out.println("Withdraw 400 : " + cuenta1.sacar(400));
		System.out.println(cliente1.toString() + " " + cuenta1.getBalance());

		// Movimientos cliente2
		System.out.println("-------------------");
		System.out.println("Withdraw 150 : " + cuenta2.sacar(150));
		System.out.println("Deposit 22.50 : " + cuenta2.depositar(22.50));
		System.out.println("Withdraw 47.62 : " + cuenta2.sacar(47.62));
		System.out.println("Withdraw 400 : " + cuenta2.sacar(400));
		System.out.println(cliente2.toString() + " " + cuenta2.getBalance());

		// Movimientos cliente3
		System.out.println("-------------------");
		System.out.println("Withdraw 150 : " + cuenta3.sacar(150));
		System.out.println("Deposit 22.50 : " + cuenta3.depositar(22.50));
		System.out.println("Withdraw 47.62 : " + cuenta3.sacar(47.62));
		System.out.println("Withdraw 400 : " + cuenta3.sacar(400));
		System.out.println(cliente3.toString() + " " + cuenta3.getBalance());

		// Movimientos cliente3
		System.out.println("-------------------");
		System.out.println("Deposit 150 : " + cuenta3.depositar(150));
		System.out.println("Withdraw 750 : " + cuenta3.sacar(750));
		System.out.println(cliente4.toString() + " " + cuenta3.getBalance());
		
		
		
	}
}