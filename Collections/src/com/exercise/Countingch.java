package com.exercise;

import java.util.*;

public class Countingch {
    static void unique(String input1) {
        String input = input1.replaceAll("\\s","");
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        char[] strArray = input.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Unique Characters are: ");
        Integer sum = 0;
        Integer temp;
        for (Map.Entry entry : charCountMap.entrySet()) {
            if (entry.getValue().equals(1)){
                System.out.println(entry.getKey() + " " + entry.getValue());
                temp = (Integer) entry.getValue();
                sum += temp;
            }
        }
        System.out.println("Number of Characters used only once: "+sum);
        System.out.println(input);
    }

    static void unique1(String input1) {
        String input = input1.replaceAll("\\s","");
        HashSet<Character> resultSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            resultSet.add(input.charAt(i));
        }
        System.out.println(resultSet);
        System.out.println("Number of Characters Used: " + resultSet.size() + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine().toLowerCase();
        unique1(input);
        unique(input);
    }
}
