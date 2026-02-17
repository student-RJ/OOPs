package Homework.Practice_question_for_UNIT_II;

public class Employee {
    double salary;

     Employee(double salary) {
        this.salary = salary;
    }

    void Salary(){
        System.out.println("this is annual salary:- "+salary*12);
    }

    public static void main(String[] args) {
        Employee e = new Employee(25000.00);
        e.Salary();
    }

}
