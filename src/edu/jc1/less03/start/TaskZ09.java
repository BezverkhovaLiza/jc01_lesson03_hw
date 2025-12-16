package edu.jc1.less03.start;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class TaskZ09 {
    public static void main(String[] args){
        double a = 6;
        double S, h, r, R;

        h = sqrt(pow(a, 2) - pow(a / 2, 2));
        S = pow(h, 2) / sqrt(3);
        R = a / sqrt(3);
        r = R / 2;

        System.out.println("Площадь = " + S);
        System.out.println("Высота = " + h);
        System.out.println("Радиус вписанной окружности = " + r);
        System.out.println("Радиус описанной окружности = " + R);
    }
}
