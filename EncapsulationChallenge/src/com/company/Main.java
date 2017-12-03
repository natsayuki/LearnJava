package com.company;

public class Main {

    public static void main(String[] args) {
        Printer duplex = new Printer(100, 100, true);
        Printer printer = new Printer(100, 100, false);

        duplex.printPage(100, true);
        duplex.printPage(1, true);
        duplex.addPaper(2);
        duplex.printPage(2, false);

        printer.printPage(100, true);
        printer.printPage(100, false);
        printer.printPage(1, false);
    }
}
