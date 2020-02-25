package java8_exercise;
interface newint{
    default void display(){
        System.out.println("Printed Default from Interface which prints only after creating an interface object");
    }
    static void displaystat(){
        System.out.println("Printed Using Static from Interface which prints after implementing the interface in class");
    }
}

public class StaticInterface implements newint{
    public static void main(String[] args) {
        newint.displaystat();
        newint interface1 = new StaticInterface();
        interface1.display();
    }
}
