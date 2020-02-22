package com.exercise;

import java.util.*;

public class ComparatorSort {
    public static void main(String[] args) {
        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Akash",3000,21));
        list.add(new Empl("Rajesh",6000,22));
        list.add(new Empl("Abhimanyu",2000,18));
        list.add(new Empl("Ram",2400,17));
        list.sort(Comparator.comparing(Empl::getSalary).reversed());
        System.out.println("Sorted list entries: ");
        for(Empl e:list){
            System.out.println(e);
        }
    }
}
class Empl{

    private String name;
    private double salary;
    private double age;

    public Empl(String n, double s, double a){
        this.name = n;
        this.salary = s;
        this.age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setAge(double age){
        this.age=age;
    }
    public double getAge(){
        return age;
    }
    public String toString(){
        return String.format("%-15.30s  %-15.30s  %-15.30s","Name: "+this.name,"Salary: "+this.salary,"Age: "+this.age);
    }
}
