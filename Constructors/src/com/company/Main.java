package com.company;

public class Main {

    public static void main(String[] args) {
        bank acc = new bank(12345, 200, "nice", "and neat", "phone numbe"  );
        acc.setBalance(200);
        acc.deposit(200);
        System.out.println(acc.getEmail());

        vip nice = new vip();
        System.out.println(nice.getEmail());
    }
}
