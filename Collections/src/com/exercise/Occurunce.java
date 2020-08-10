package com.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurunce {
    static void characterCount(String input)
    {
        String inputString = input.replaceAll("\\s","");
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();
        characterCount(str);
    }
}
