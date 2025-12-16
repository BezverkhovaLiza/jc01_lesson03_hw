package edu.jc1.less03.start;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class TaskZ03 {
    public static void main(String[] args){
        double xA = 1, yA = 1, xB = 4, yB = 4, xC = 6, yC = 2;
        double a, b, c;
        double sinus, cosinus;
        double P, S;

        a = sqrt(pow(xA - xB, 2) + pow(yA - yB, 2));
        b = sqrt(pow(xC - xA, 2) + pow(yC - yA, 2));
        c = sqrt(pow(xB - xC, 2) + pow(yB - yC, 2));

        cosinus = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
        sinus = sqrt(1 - pow(cosinus, 2));

        P = a + b + c;
        S = (a * b * sinus) / 2;

        System.out.println("Периметр = " + P);
        System.out.println("Площадь = " + S);
        System.out.println(cosinus);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
