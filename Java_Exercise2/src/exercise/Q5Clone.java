package exercise;
//WAP to show object cloning in java using copy constructor

public class Q5Clone {
    int a,b,c;

    public Q5Clone(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Q5Clone(Q5Clone c){
        a=c.a;
        b=c.b;
    }

}
class copy{
    public static void main(String[] args) {
        Q5Clone c= new Q5Clone(1,2,3);
        Q5Clone c1= new Q5Clone(c);
        System.out.println("Copy of object c in c1 is:"+c1.a+" "+c1.b+ " "+ c.b);
    }
}