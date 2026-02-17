package Homework.Practice_question_for_UNIT_I;

public class arithmetic {
    public static void main(String[] args) {
        int a=10;
        int b =20;

        System.out.println("Addition of 2 is:- "+(a+b));
        System.out.println("Subtraction of 2 is:- "+(a-b));
        System.out.println("Multiplication of 2 is:- "+(a*b));

        if (b != 0) {
            System.out.println("Division is: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }

    }
}
