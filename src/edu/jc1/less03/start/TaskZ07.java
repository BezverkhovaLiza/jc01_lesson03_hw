package edu.jc1.less03.start;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class TaskZ07 {
    public static void main(String[] args){
        double a = -9;
        double b = 4;

        double ar = (pow(a,3) + pow(b,3)) / 2;
        double geo = Math.sqrt(abs(a) * abs(b));

        System.out.println("Среднее арифметическое = " + ar);
        System.out.println("Среднее геометрическое = " + geo);
    }
}
