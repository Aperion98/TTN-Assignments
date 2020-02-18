package com.cj;
import java.util.*;

public class Firstques {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("The string you entered is: \n" + a );
        System.out.println("The replaced string is: ");
        System.out.println(a.replace("a","b"));


    }

}

