package com.company;

public class Printer {
    private int toner = 100;
    private int pages;
    private boolean isDuplex;

    public Printer(int toner, int pages, boolean isDuplex) {
        if(toner > 0 && toner <= 100){
            this.toner = toner;
        }
        this.pages = pages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount){
        this.toner+=amount;
        if(this.toner > 100) {
            this.toner = 100;
            System.out.println("Toner overflowed and is now at 100%");
        }
    }

    public void printPage(int amount, boolean doubleSided){
        if(doubleSided && !this.isDuplex){
            System.out.println("you can't print double sided on a non duplex printer");
        }else{
            if(amount > this.pages){
                System.out.println("you don't have enough pages to print " + amount);
            }else{
                this.pages -= amount;
                System.out.printf("You printed " + amount + " pages");
                if(doubleSided){
                    System.out.printf(" on two sides \n");
                }else{
                    System.out.printf("\n");
                }
            }
        }
    }

    public void addPaper(int amount){
        this.pages += amount;
        System.out.println(amount + " pages added");
    }

    public int getToner() {
        return toner;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
