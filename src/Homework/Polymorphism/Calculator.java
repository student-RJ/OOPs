package Homework.Polymorphism;

public class Calculator {
    int num1;
    int num2;
    int num3;

    int Addition(int num1,int num2){
        return num1+num2;
    }
    int Addition(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.Addition(12,10);
        c.Addition(10,20,30);
    }

}
