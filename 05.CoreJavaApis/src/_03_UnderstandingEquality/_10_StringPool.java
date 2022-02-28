package _03_UnderstandingEquality;

public class _10_StringPool {
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
        System.out.println(singleString == concat);//false, two different objects. Concatenation is like cslling a
        // method and results in a new String.

        String c = "Hello World";
        String d = new String("Hello World");
        System.out.println( "New string: " + (c == d));//false, it created an object inneficiently

        //intern()
        String e = "Hello World";
        String f = new String("Hello World").intern();//it will add it to the string pool
        System.out.println( "Intern(): " + (e == f));

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println("first == second: " + (first == second) );
        System.out.println("first == second.intern(): " + (first == second.intern()) );
        System.out.println("first == third: " + (first == third) );
        System.out.println("first == third.intern(): " + (first == third.intern()) );

    }
}
