package com.cj;
import java.util.*;

public class Fourtques {
    public static void main(String args[]) {
        System.out.println("Enter a Paragraph: ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        char[] charArray = data.toCharArray();
        int up = 0;
        int lo = 0;
        int num = 0;
        int others = 0;

        int totalChars = data.length();
        for (int i = 0; i < data.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                up++;
            } else if (Character.isLowerCase(charArray[i])) {
                lo++;
            } else if (Character.isDigit(charArray[i])) {
                num++;
            } else {
                others++;
            }
        }
        System.out.println("Total length of the string :" + totalChars);
        System.out.println("Upper case :" + up);
        System.out.println("Percentage of upper case letters: " + (up * 100) / totalChars + "%");
        System.out.println("Lower case :" + lo);
        System.out.println("Percentage of lower case letters:" + (lo * 100) / totalChars + "%");
        System.out.println("Digit :" + num);
        System.out.println("Percentage of digits :" + (num * 100) / totalChars + "%");
        System.out.println("Others :" + others);
        System.out.println("Percentage of other characters :" + (others * 100) / totalChars);
    }
}
