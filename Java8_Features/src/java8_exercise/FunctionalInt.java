package java8_exercise;

interface Add{
    int one(int a,int b);
}
public class FunctionalInt {
    public static void main(String[] args) {
        Add add = (a,b)->{return a;};
        System.out.println("Returning one value: "+add.one(5,6));
    }
}
