package Homework.Practice_question_for_UNIT_II;

public class Student1 {
    String Name;
    int Roll_no;
    double fees;
    int marks;

     Student1() {
         System.out.println("Default Constructor ");
    }

    Student1(String Name, int Roll_no){
        this.Name=Name;
        this.Roll_no=Roll_no;
    }

     Student1(String name, int roll_no, double fees, int marks) {
       this.Name = name;
        this.Roll_no = roll_no;
        this.fees = fees;
        this.marks = marks;
    }

    void display (){
        System.out.println("Name:- "+Name);
        System.out.println("Roll No:- "+Roll_no);
        System.out.println("marks:- "+marks);
        System.out.println("fees:- "+fees);
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        Student1 s1 = new Student1("Rohan Jadhav",28);
        Student1 s2 = new Student1("Rohan Jadhav",28,72138.00,90);

        s.display();
        System.out.println("---------------------------");
        s1.display();
        System.out.println("---------------------------");
        s2.display();
    }
}
