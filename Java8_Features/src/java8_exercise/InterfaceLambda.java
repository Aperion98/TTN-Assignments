package java8_exercise;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceLambda {
    public static void main(String[] args) {
        //Supplier example
        Supplier supply = ()->"Supplier has Supplied";
        String k = (String) supply.get();

        //Consumer example
        Consumer customer = (a)-> System.out.println("Supplier supplied and consumer consumed");
        customer.accept(k);

        //Predicate example
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));

        //Function example
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(10));
    }
}
