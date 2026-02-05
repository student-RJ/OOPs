package Constructor;

public class Car1 {
     String brand;
     int year;
     double price;

     Car1(String brand, int year, double price){
         this.brand =brand;
         this.year= year;
         this.price = price;
     }

    Car1(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void setprice(double price) {
        this.price = price;
    }
    void display(){
        System.out.println("brand is :- "+brand);
        System.out.println("year is :- "+year);
        System.out.println("price is :- "+price);
    }
}
class  Main{
    public static void main(String[] args) {

        Car1 c1=new Car1("BMW",2005,2500.0);
        c1.display();

        Car1 c2 = new Car1("BMW",1989);
        c2.setprice(1500.0);
        c2.display();
    }
}
