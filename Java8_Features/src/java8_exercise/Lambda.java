package java8_exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface Greater{
    boolean compare(int i, int j);
}
interface Increment{
    int inc(int k);
}

interface Concatenate{
    String concat(String a, String b);
}

interface UpperCaseMe{
    String uppMe(String s);
}
public class Lambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 1-");
        System.out.println("Enter 2 Integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Greater greater = (i,j)->{
            if(i>j)
                return true;
            else
                return false;
        };
        System.out.println(greater.compare(a,b));
        System.out.println("");
        System.out.println("Answer 2-");
        Increment increment = (k)->{return k+1;};
        System.out.println("Prev Value: 30\t"+"New Value: "+increment.inc(30));
        System.out.println("");
        System.out.println("Answer 3");
        Concatenate concatenate = (i,j)->{return i+j;};
        System.out.println(concatenate.concat("abc","xyz"));
        System.out.println("");
        System.out.println("Answer 4");
        UpperCaseMe upperCaseMe = (s)->{return s.toUpperCase();};
        System.out.println(upperCaseMe.uppMe("Convert string to upper: "));
    }

}
