package com.cj;

public class TenthQues {
    public Integer TenthQues(Integer a, Integer b){
        return (a+b);
    }
    public double TenthQues(double a, double b){
        return (a+b);
    }
    public float TenthQues(float a, float b){
        return (a*b);
    }
    public int TenthQues(int a, int b){
        return (a*b);
    }
    public String TenthQues(String a, String b){
        return (a+b);
    }
    public String TenthQues(String a, String b, String c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        TenthQues t = new TenthQues();
        Integer a =10; Integer b = 10;
        System.out.println(t.TenthQues(a,b)+ " Overloading Integer");
        System.out.println(t.TenthQues(10.0,12.2)+ " Overloading double");
        System.out.println(t.TenthQues(10f,10f)+" Overloading float");
        System.out.println(t.TenthQues(10,10)+ " Overloading int");
        System.out.println(t.TenthQues("String","Concatenate")+ " Overloading String");
        System.out.println(t.TenthQues("String","Concatenate","withonemore")+ " Overloading String with more ");
    }
}
