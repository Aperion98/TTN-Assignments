package com.cj;

public class Seventhques {
    static String a = "Shubham";
    static String b = "Dodeja";
    static int age = 21;
    static {
        System.out.println(" First Name: Shubham \n Last Name: Dodeja \n Age: 21 \n This was printed using static block \n");
    }
    static void name_class(){
        System.out.println(" First Name: Shubham \n Last Name: Dodeja \n Age: 21 \n This was printed using static method \n");
    }

    public static void main(String[] args) {
        name_class();
        System.out.println(String.format(" First Name: %s \n Last Name: %s \n Age: %d \n This was printed suing static variables", a,b,age));
    }
}
