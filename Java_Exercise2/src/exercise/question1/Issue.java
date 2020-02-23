package exercise.question1;

import java.util.Scanner;

public class Issue extends Create {
    Create create = new Create();
    public void issue(){
        System.out.println("Enter the name of book you want to issue: ");
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        boolean ans = create.Books.contains(input1);
        if(ans){
            System.out.println("BOOK IS AVAILABLE YOU CAN ISSUE IT");
        }
        else{
            System.out.println("BOOK IS NOT AVAILABLE YOU CANNOT ISSUE IT");
        }
    }
}
