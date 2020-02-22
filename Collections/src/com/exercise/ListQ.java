package com.exercise;
import java.lang.*;
import java.util.ArrayList;

public class ListQ {
    public static void main(String[] args) {
        ArrayList<Float> arrlist = new ArrayList<Float>();
        arrlist.add(5.2f);
        arrlist.add(78.5f);
        arrlist.add(67.22f);
        arrlist.add(12f);
        arrlist.add(15.2f);
        System.out.println(arrlist);
        float sum = 0f;
        for (float i:arrlist){
            sum += i;
        }
        System.out.println("Sum of the list is: "+sum);
    }
}
