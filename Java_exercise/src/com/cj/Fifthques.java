package com.cj;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Fifthques {
    public static void common(int arr1[], int arr2[]) {
        System.out.println("Common elements are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array1: ");
        int input = sc.nextInt();
        int a[] = new int[input];
        for (int p = 0; p < input; p++) {
            System.out.print("Enter Array1 element: ");
            a[p] = sc.nextInt();
        }
        System.out.println("The first array is: " + Arrays.toString(a));
        System.out.print("Enter the length of Array2: ");
        int b = sc.nextInt();
        int q[] = new int[b];
        for (int r = 0; r < b; r++) {
            System.out.print("Enter Array2 element: ");
            q[r] = sc.nextInt();
        }
        System.out.println("The second array is: " + Arrays.toString(q));
        common(a,q);
    }
}
