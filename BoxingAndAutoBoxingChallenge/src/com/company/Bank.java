package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addBranch(Branch branch){
        this.branches.add(branch);
    }

    public Branch getBranch(String branchName){
        while(true){
            for(int i=0; i<branches.size(); i++){
                if(branches.get(i).getName() == branchName){
                    return branches.get(i);
                }
            }
            return null;
        }
    }

    public ArrayList<Account> getAccounts(String branchName){
        return getBranch(branchName).getAccounts();
    }

    public Account getAccount(String branchName, String accountName){
        ArrayList<Account> accounts = getBranch(branchName).getAccounts();

        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getName() == accountName){
                return accounts.get(i);
            }
        }
        return null;
    }

    public ArrayList<Double> getTransactions(String branchName, String accountName){
        ArrayList<Account> accounts = getAccounts(branchName);
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getName() == accountName){
                return accounts.get(i).getTransactions();
            }
        }
        return null;
    }

    public void addAccount(String branchName, Account account){
        getBranch(branchName).addAccount(account);
    }

}
