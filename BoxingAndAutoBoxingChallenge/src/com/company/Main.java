package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank();

	    bank.addBranch(new Branch("branch1"));

	    Account bill = new Account("bill");

        bank.addAccount("branch1", bill);

        ArrayList<Double> transactions = bank.getTransactions("branch1", "bill");

        bank.getAccount("branch1", "bill").newTransaction(20);
        bank.getAccount("branch1", "bill").newTransaction(50);
        System.out.printf("Bill's transactions are ");
        for(int i=0; i<transactions.size(); i++){
            if(i == transactions.size() - 1){
                System.out.printf(transactions.get(i) + "");
            }else{
                System.out.printf(transactions.get(i) + ", ");
            }
        }



    }
}
