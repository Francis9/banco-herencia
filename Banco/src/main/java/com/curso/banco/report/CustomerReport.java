package com.curso.banco.report;

import com.curso.banco.dominio.Customer;

public class CustomerReport {

	public void informeClientes(Customer[] clientes) {

		for (Customer f : clientes) {

			System.out.println("Customer :" + f.getFirstname() + f.getLastname());

		}

	}

}
