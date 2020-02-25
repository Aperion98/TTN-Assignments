package java8_exercise;
interface Parent1{
    default void display(){
        System.out.println("Printing for Parent 1");
    };
}
interface Parent2{
    default void print(){
        System.out.println("printing for Parent 2");
    };
}
public class MultipleInherit implements Parent1,Parent2 {
    public static void main(String[] args) {
        MultipleInherit inherit1 = new MultipleInherit();
        inherit1.display();
        inherit1.print();
    }

}
