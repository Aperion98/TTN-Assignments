package exercise;

import java.util.Scanner;

public class Q8DoWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter some words to check");
        String word=sc.next();

        do{
            char ch1=word.charAt(0);
            char ch2=word.charAt(word.length()-1);
            if(ch1==ch2){
                System.out.println("last and first char are same of : " +word);
            }
            else {
                System.out.println("last and first char are not same of word : " + word);
            }
            word=sc.next();
        }

        while(!word.equals("done"));

    }
}
