package Homework.Inheritance;

public class Person {
      String Name;

    public Person(String name) {
        Name = name;
    }
}
class  Student extends  Person{

    int Roll_no;

    public Student(String name, int roll_no) {
        super(name);
        Roll_no = roll_no;
    }
    void display(){
        System.out.println("Name:- "+Name);
        System.out.println("Roll NO:- "+Roll_no);

    }

}
