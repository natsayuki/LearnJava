package com.company;

import java.util.ArrayList;

public class Account {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void newTransaction(double amount){
        this.transactions.add(amount);
        System.out.println("Transaction for " + amount + " added");
    }
}
