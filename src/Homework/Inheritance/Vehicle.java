package Homework.Inheritance;


class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging...");
    }
}


