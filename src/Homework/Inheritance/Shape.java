package Homework.Inheritance;

class  Shape {
    int l;
    int b;
    double r;

    public Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public Shape(double r) {
        this.r = r;
    }
}
class Rectangle extends Shape{

     Rectangle(int l, int b) {
         super(l,b);
    }
    void Area(){
        System.out.println("Area of Rectangle:"+l*b);
    }
}
class Circle extends Shape{

    Circle(double r) {
        super(r);
    }
    void Area(){
        System.out.println("Area of Circle:"+ Math.PI*r*r);
    }
}
