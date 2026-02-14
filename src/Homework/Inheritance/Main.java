package Homework.Inheritance;

public class Main {
    public static void main(String[] args) {

        Student s = new Student ("Rohan",19);
        s.display();


        // created for second  class

        ElectricCar car = new ElectricCar();

        car.start();
        car.drive();
        car.charge();

        Rectangle r = new Rectangle(20,20);
        r.Area();

        Circle c = new Circle(23.5);
        c.Area();
    }
}
