package Homework.Practice_question_for_UNIT_II;

public class Student {
    String Name;
    int roll_no ;
    double marks;


    Student(String Name, int roll_no,double marks){
        this.Name=Name;
        this.roll_no = roll_no;
        this.marks=marks;
    }

    void display(){
        System.out.println("Name:- "+Name);
        System.out.println("roll NO:- "+roll_no);
        System.out.println("Marks:- "+marks);
    }

    public static void main(String[] args) {
        Student s = new Student("Rohan Jadhav",19,90.83);
        s.display();
    }
}
