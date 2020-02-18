package com.cj;

public class NinthQuesMain {
    public static void main(String[] args) {
        System.out.println("All Laptop prices:");
        for (NinthQuesEnum c : NinthQuesEnum.values()) System.out.println(
                c + " costs: $" + c.getPrice());
    }
}
