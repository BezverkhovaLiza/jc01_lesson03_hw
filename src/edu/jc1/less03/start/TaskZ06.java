package edu.jc1.less03.start;

public class TaskZ06 {
    public static void main(String[] args){
        int a = 3567; //"1234"

        String b = Integer.toString(a);
        char[] c = b.toCharArray();

        int d = 0;

        for(int i = 0; i < 4; i++){
            int temp = Character.getNumericValue(c[i]);
            d = d + temp;
        }

        System.out.println("Сумма цифр числа = " + d);
    }
}
