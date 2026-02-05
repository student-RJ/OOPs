package Homework.Constructor;

public class overloading {
    int num1;
    int num2;
    double num3;
    float num4;

    overloading(int num1,int num2){
        this.num1=num1;
        this.num2=num2;

        System.out.println("Num 1:-"+num1);
        System.out.println("Num 2:-"+num2);
    }
    overloading(double num3,float num4){
        this.num3=num3;
        this.num4=num4;

        System.out.println("Num 3:-"+num3);
        System.out.println("Num 4:-"+num4);
    }

    public static void main(String[] args) {
        overloading o = new overloading(12,12);

        System.out.println("-------------------------");
        overloading o2 = new overloading(23.0,23f);
    }
}
