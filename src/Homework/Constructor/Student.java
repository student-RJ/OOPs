package Homework.Constructor;

public class Student {
    int marks;
    String name;

    Student(int m,String n){
        this.marks=m;
        this.name=n;
    }
    void display(){
        System.out.println("Name:- "+name);
        System.out.println("marks:- "+marks);
    }

    public static void main(String[] args) {
        Student s = new Student(94,"Rohan Jadhav");
        s.display();
    }
}
