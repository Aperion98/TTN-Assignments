package com.cj;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

public class thirdques {
    private static long countOccurrences(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence = sc.nextLine().toLowerCase();
        System.out.println("Enter the character you want to search: ");
        char a = sc.next().charAt(0);
        System.out.println(countOccurrences(sentence, a));

    }
}
