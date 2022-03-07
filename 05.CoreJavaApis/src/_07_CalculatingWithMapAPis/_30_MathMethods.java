package _07_CalculatingWithMapAPis;

public class _30_MathMethods {
    public static void main(String[] args) {

        //Pay special attention to return types in math questions. They are an
        //excellent opportunity for trickery!

        //min() and max()
        //The min() and max() methods compare two values and return one of them.
        int first = Math.min(7,9); //7
        int second = Math.max(7,9); //9
        System.out.println("Min: " + first);
        System.out.println("Max: " + second);

        //round()
        //The round() method gets rid of the decimal portion of the value, choosing
        //the next higher number if appropriate. If the fractional part is .5 or higher,
        //we round up.
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
        //The random() method returns a value greater than or equal to 0 and less
        //than 1. The method signature is as follows:
        double num = Math.random();
        System.out.println(num); // 0.9327667594795419
        System.out.println(Math.round(num)); // 0 or 1
        System.out.println(Math.round((num * 8) +1)); // 8

    }
}
