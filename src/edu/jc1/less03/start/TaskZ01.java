package edu.jc1.less03.start;
import static java.lang.Math.sqrt;

public class TaskZ01 {
    public static void main(String[] args){
        double a = 3;
        double b = 4;

        double c = sqrt(a * a + b * b);

        double P = a + b + c;
        double S = (a * b) / 2;

        System.out.println("Периметр = " + P + " см");
        System.out.println("Площадь = " + S + " см^2");
    }
}
