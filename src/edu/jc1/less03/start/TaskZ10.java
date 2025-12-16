package edu.jc1.less03.start;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class TaskZ10 {
    public static void main(String[] args){
        double P = 10;
        double S;

        S = PI * pow((P / (2 * PI)), 2);

        System.out.println("Площадь круга = " + S + " см^2");
    }
}
