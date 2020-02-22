package com.exercise;
import java.util.*;

public class Mapsort {
    public static Map<String, String> sortMap(Map<String, String> map) {
        List<Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());

        Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : capitalList)
        {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {

        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
        capitals.put("Nepal", "Kathmandu");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Australia", "Canberra");

        Map<String, String> result = sortMap(capitals);
        String val ="Value: ";
        for (Map.Entry<String, String> entry : result.entrySet())
        {
            System.out.format("%-20.30s  %-20.30s%n", "Key: " + entry.getKey() ,"Value: "+entry.getValue());
            //System.out.format("%4d Value: " + entry.getValue());
        }
    }

}
