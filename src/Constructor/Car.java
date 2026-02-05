package Constructor;

public class Car {
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year= year;
    }
    void display(){
        System.out.println("brand "+brand);
        System.out.println("year"+ year);
    }

    public static void main(String[] args) {
        Car c = new Car("BMW",2025);

        c.display();
    }
}
