package com.company;

public class bank {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public bank(){
        this(12345, 200, "default name", "default email", "default phone");
    }
    public bank(String name, String email, String phone){
        this(12345, 200, name, email, phone);
    }
    public bank(int number, double balance, String name, String email, String phone){
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public void setNumber(int number){
        this.number = number;
    }public void setBalance(double number){
        this.balance = number;
    }public void setName(String name){
        this.name = name;
    }public void setEmail(String email){
        this.email = email;
    }public void setPhone(String phone){
        this.phone = phone;
    }public int getNumber(){
        return this.number;
    }public double getBalance(){
        return this.balance;
    }public String getName(){
        return this.name;
    }public String getEmail(){
        return this.email;
    }public String getPhone(){
        return this.phone;
    }
    public void deposit(double amount){
        this.balance += amount;

        System.out.println("your balance is now " + this.balance);
    }public void withdraw(double amount){
        this.balance -= amount;
        System.out.println("your balance is now " + this.balance);
    }
}
