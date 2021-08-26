package com.curso.banco.report;

import com.curso.banco.dominio.Account;
import com.curso.banco.dominio.Bank;
import com.curso.banco.dominio.ChekingAccount;
import com.curso.banco.dominio.Customer;
import com.curso.banco.dominio.SavingAccount;

public class CustomerReport {


	public CustomerReport() {
	}

	public void generateReport() {

		System.out.println("CUSTOMERS REPORT");
		System.out.println("================");

		for (int cust_idx = 0; cust_idx < Bank.getNumOfCustomers(); cust_idx++) {
			Customer customer = Bank.getCustomer(cust_idx);

			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

			for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
				Account account = customer.getAccount(acct_idx);
				String account_type = "";

				// Determine the account type
				if (account instanceof SavingAccount) {
					account_type = "Savings Account";
				} else if (account instanceof ChekingAccount) {
					account_type = "Checking Account";
				} else {
					account_type = "Unknown Account Type";
				}

				System.out.println(account_type + ": current balance is " + account.getBalance());
			}
		}
	}
}
