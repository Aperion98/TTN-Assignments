package exercise.question1;


import java.util.Scanner;
class Library implements issue,returnbook{
    @Override
    public void Checkout() {

    }

    @Override
    public void Returne() {

    }

    @Override
    public void Returned_Books() {

    }

    @Override
    public void Balance() {

    }
}
public class Main{
    public static void main(String[] args) {
        Library lib = new Library();
        Create create = new Create();
        create.create();
        create.display();
        Issue issue = new Issue();
        System.out.println("What would like to do?");
        System.out.println("1) Display Books");
        System.out.println("2) Return Book");
        System.out.println("3) Issue book");
        System.out.print("Enter Your Answer(1/2/3): ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 1:
                create.display();
                break;
            case 3:
                issue.issue();
                break;
            case 2:
                lib.Returne();
                break;
            default:
                System.out.println("Please Give Valid Input");
        }

    }
}
