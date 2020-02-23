package exercise;

//Create a custom exception that do not have any stack trace.
public class Q13 {
    public static void main(String[] args) {
        try{
            throw new customException("Shubham");
        }
        catch(customException CE){
            System.out.println("caught");
            CE.printStackTrace();
            //IT WIL SHOW WHAT HAPPEN AND WHERE
        }

    }
}

//To create a custom exception, we have to extend the java.lang.Exception class.
class customException extends Exception{
    customException(String name){
        super(name);
    }
}