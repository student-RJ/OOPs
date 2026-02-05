package Homework.Polymorphism;

public class Shape {
      double radius;
      int l,b;

      void get_Area(int l,int b){
          System.out.println("Rectangle Area:-"+l*b);
      }
      void get_Area(double radius){
        System.out.println("Circle Area:-"+Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.get_Area(23,23);
        s.get_Area(23.4);
    }

}