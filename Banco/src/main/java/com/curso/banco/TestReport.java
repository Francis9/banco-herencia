package com.curso.banco;

import com.curso.banco.dominio.Bank;
import com.curso.banco.dominio.ChekingAccount;
import com.curso.banco.dominio.Customer;
import com.curso.banco.dominio.SavingAccount;
import com.curso.banco.report.CustomerReport;

public class TestReport {


    public static void main(String[] args) {
        Bank     bank = new Bank();
        initializeCustomers(bank);
        
        // run the customer report
        CustomerReport report = new CustomerReport();
        report.generateReport();
    }
    
    private static void initializeCustomers(Bank bank) {
        Customer customer;
        
        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingAccount(500.00, 1));
        customer.addAccount(new ChekingAccount(200.00, 400.00));
        
        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(1);
        customer.addAccount(new ChekingAccount(200.00));
        
        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        customer.addAccount(new SavingAccount(1500.00, 1));
        customer.addAccount(new ChekingAccount(200.00));
        
        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new SavingAccount(150.00, 0.05));
    }
}
