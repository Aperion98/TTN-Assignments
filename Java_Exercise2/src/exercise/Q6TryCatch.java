package exercise;

public class Q6TryCatch {
    public static void main(String[] args) {
        int x=90,y=24,z=70;
       try{
           if(1==0){
               System.out.println("x is 10");
           }
           int b=x/0;
           System.out.println(b);
       }
       catch(ArithmeticException e){
           System.out.println("ArithmeticException is occur");
       }
       catch (NumberFormatException e){
           System.out.println("NumberFormatException is occur");
       }
       finally{
           int a=x+y+z;
           System.out.println(a);
       }
    }
}
