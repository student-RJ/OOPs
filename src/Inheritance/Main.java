package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.l+" "+b1.h+" "+b1.w);

        Box b2 = new Box(4);
        System.out.println(b2.l+" "+b2.h+" "+b2.w);

        Box b3 = new Box(12 ,9,3);
        System.out.println(b3.l+" "+b3.h+" "+b3.w);

        Box copy = new Box(b3);
        System.out.println(copy.l+" "+copy.h+" "+copy.w);

        BoxWeight box5 = new BoxWeight(12, 9, 8 , 25);
        System.out.println(box5.l+" "+box5.h+" "+box5.w+box5.weight);
    }
}
