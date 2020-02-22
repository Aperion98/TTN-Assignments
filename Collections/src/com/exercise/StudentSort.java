package com.exercise;

import java.util.*;

public class StudentSort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Akash",50,21));
        list.add(new Student("Rajesh",41,22));
        list.add(new Student("Abhimanyu",41,18));
        list.add(new Student("Ram",29,17));
        list.sort(Comparator.comparing(Student::getScore).thenComparing(Student::getName));
        System.out.println("Sorted list entries: ");
        for(Student s:list){
            System.out.println(s);
        }
    }
}
class Student{

    private String name;
    private double score;
    private double age;

    public Student(String n, double s, double a){
        this.name = n;
        this.score = s;
        this.age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void setAge(double age){
        this.age=age;
    }
    public double getAge(){
        return age;
    }
    public String toString(){
        return String.format("%-15.30s  %-15.30s  %-15.30s","Name: "+this.name,"Score: "+this.score,"Age: "+this.age);
    }
}

