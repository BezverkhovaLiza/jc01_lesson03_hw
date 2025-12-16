package edu.jc1.less03.start;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class Task05 {
    public static void main(String[] args){
        double x = 4;
        double y = 2;

        double result;

        double temp = cos(x) - sin(y);

        if(temp != 0){
            result = ((sin(x) + cos(y)) / temp) * tan(x) * y;
        }
        else{
            System.out.println("Знаменатель равет нулю.");
            result = Double.NaN;
        }
        System.out.println("result = " + result);
    }
}
