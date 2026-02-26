package Homework.Practice_question_for_UNIT_II;

public class Overloading {
    int a ,b,c;

     Overloading(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Overloading(int a, int b,int c) {
        this.a = a;
        this.b = b;
        this.c =c;
    }

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading(10,20);
        o.display();

        System.out.println("-------------------------");
        Overloading o2 = new Overloading(10,20,30);
        o2.display();

    }

}
