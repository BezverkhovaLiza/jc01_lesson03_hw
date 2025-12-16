package edu.jc1.less03.start;
import static java.lang.Math.pow;

public class TaskZ05 {
    public static void main(String[] args){
        double pi = Math.PI;
        double p1, p2, p3, p4;

        p1 = pow(pi, 0);
        p2 = pow(pi, 1);
        p3 = pow(pi, 2);
        p4 = pow(pi, 3);

        System.out.println("Первые четыре степени числа пи:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
