package com.cj;

public class Bank {
    public void getDetails() {
        System.out.println("Details of the bank :");
    }
}

class BOI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: BOI");
        System.out.println("\nROI: 8%");
    }
}

class SBI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: State Bank of India");
        System.out.println("\nROI: 12%");
    }
}

class ICICI extends Bank {
    public void getDetails() {
        System.out.println("====================================");
        System.out.println("\nName: ICICI");
        System.out.println("\nROI: 9%");
    }
}

class Main {
    public static void main(String[] args) {
        Bank d = new Bank();
        Bank b = new BOI();
        Bank s = new SBI();
        Bank i = new ICICI();
        d.getDetails();
        b.getDetails();
        s.getDetails();
        i.getDetails();
    }
}
