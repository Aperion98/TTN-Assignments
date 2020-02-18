package com.cj;

public enum NinthQuesEnum {
    MSI(2000),Lenovo(1200),Acer(800),Asus(959),Gigabyte(1600),Razor(2400);
    private double price;
    NinthQuesEnum(double p) {
        price = p;
    }
    double getPrice() {
        return price;
    }
}
