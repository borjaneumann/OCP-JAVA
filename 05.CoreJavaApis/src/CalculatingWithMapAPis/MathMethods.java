package CalculatingWithMapAPis;

public class MathMethods {
    public static void main(String[] args) {
        //min() and max()
        int first = Math.min(7,9); //7
        int second = Math.max(7,9); //9
        System.out.println("Min: " + first);
        System.out.println("Max: " + second);

        //round()
        long low = Math.round(123.45); //123
        long high = Math.round(123.50); //124
        int fromFloat = Math.round(123.45f); //123
        System.out.println("Low: " + low);
        System.out.println("High: " + high);
        System.out.println("FromFloat: " + fromFloat);

        //pow
        double squared = Math.pow(5,2);//25
        System.out.println("Square power: " + squared);

        //random
        double num = Math.random();
        System.out.println(num);
        System.out.println(Math.round((num * 8) +1));

    }
}
