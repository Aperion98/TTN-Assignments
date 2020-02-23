package exercise.question1;

import java.util.ArrayList;
import java.util.List;

public class Create {
    public final List<String> Books=new ArrayList<String>();
    public void create(){
        Books.add("Book1");
        Books.add("Book2");
        Books.add("Book3");
        Books.add("Book4");
        Books.add("Book5");
        Books.add("Book6");
    }
    public void display(){
        System.out.println("Books available in library are :");
        for(String x: Books){
            System.out.println(x);}
    }
}
