package com.cj;
import java.util.Scanner;
public class Eigthques {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuffer input = new StringBuffer();
        input = input.append(a);
        input = input.reverse();
        System.out.println("Reverse String is: "+input);
        input.delete(4,10);         //Index from 4-10
        System.out.println("String with characters deleted: "+input);
    }
}
