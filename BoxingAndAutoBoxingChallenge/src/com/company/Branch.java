package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }
}
