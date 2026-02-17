package Homework.Practice_question_for_UNIT_II;

public class Rectangle {
    double l;
    double b;

    Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }

    void area(){
        System.out.println("Area of Rectangle is:- "+l*b);
    }

    void perimeter(){
        System.out.println("Perimeter of Rectangle is:- "+2*(l+b));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(90,86.7);
        r.area();
        r.perimeter();
    }
}
