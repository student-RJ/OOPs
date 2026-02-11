package Inheritance;

public class BoxWeight extends  Box {
 double weight;

    BoxWeight(double weight){
        this.weight=weight;
    }

    BoxWeight(double l,double h, double w, double weight){
        super(l,h,w);
        this.weight=weight;
    }

}
