package com.cj;

import java.util.*;

public class secques {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String entry = sc.nextLine().toLowerCase();
        String words[] = entry.split(" ");
        int wrc = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }
            if (wrc > 1)
                System.out.println(words[i] + "--" + wrc);
            wrc = 1;
        }
    }
}