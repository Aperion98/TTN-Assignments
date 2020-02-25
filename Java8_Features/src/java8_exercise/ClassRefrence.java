package java8_exercise;
interface Numbers{
    int calculate(int a, int b);
}
class NewClass{
    int add(int a, int b){
        return a+b;
    }

    int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }
}
public class ClassRefrence {
    public static void main(String[] args) {
        Numbers numbers = new NewClass()::add;
        System.out.println("Adding 5 and 8: "+numbers.calculate(5,8));
        numbers = new NewClass()::subtract;
        System.out.println("Subtracting 5 and 8: "+numbers.calculate(5,8));
        numbers = NewClass::multiply;
        System.out.println("Multiplying 5 and 8: "+numbers.calculate(5,8));
    }
}
