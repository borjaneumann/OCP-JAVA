package understandingEquality;

public class StringPool {
    public static void main(String[] args) {
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); //true

        String a = "Hello World";
        String b = " Hello World".trim(); //false, method applied at runtime.
        System.out.println( a ==b );

        String singleString = "Hello World";
        String concat = "Hello ";
        concat += "world";
        System.out.println(singleString == concat);//false, two different objects
    }
}
