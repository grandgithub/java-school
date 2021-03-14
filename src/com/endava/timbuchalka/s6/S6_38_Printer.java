package com.endava.timbuchalka.s6;

public class S6_38_Printer {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was = " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was = " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
    }
}

class Printer {

    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel > -1 && tonerLevel < 100 ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int result = -1;
        if (tonerAmount > 0 && tonerAmount <= 100 && (tonerLevel + tonerAmount) <= 100) {
            tonerLevel += tonerAmount;
            result = tonerLevel;
        }
        return result;
    }

    public int printPages(int pages) {
        if (pages < 1) {
            return -1;
        }
        int pagesToPrint = duplex ? pages / 2 + pages % 2 : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
