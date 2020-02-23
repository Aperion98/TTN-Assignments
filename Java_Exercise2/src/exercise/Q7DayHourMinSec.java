package exercise;

import java.util.Scanner;

public class Q7DayHourMinSec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter seconds you want to convert into days");
        int input=sc.nextInt();

        int d=input/(60*60*24);
        int dh=(input)%(60*60*24);
        int h=dh/(60*60);
        int hm=dh%(60*60);
        int s=hm/(60);
        int ss=hm%(60);



        System.out.println("time is in DAY/HOUR/MINUTES/SECONDS="+d+":"+h+":"+s+":"+ss);

    }
}
