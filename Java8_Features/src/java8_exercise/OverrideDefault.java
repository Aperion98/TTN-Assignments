package java8_exercise;
interface myint{
    default void display(){
        System.out.println("Default");
    }
}

public class OverrideDefault {
    public static void main(String[] args) {
        myint interface1 = new myint() {
            @Override
            public void display() {
                System.out.println("Interface display overridden");
            }
        };
        interface1.display();
    }
}
