package _03_UnderstandingEquality;

public class _10_StringPool {

    //The string pool is also known as the intern pool
    public static void main(String[] args) {

        //Let’s now visit the more complex and confusing scenario, String
        //equality, made so in part because of the way the JVM reuses String
        //literals.
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); //true

        /*
        In this example, we don’t have two of the same String literal. Although a
        and b happen to evaluate to the same string, one is computed at runtime.
        Since it isn’t the same at compile-time, a new String object is created.
         */
        String a = "Hello World";
        String b = " Hello World".trim(); //false, method applied at runtime.
        System.out.println( a ==b );

        //This prints false. Concatenation is just like calling a method and results
        //in a new String. You can even force the issue by creating a new String
        String singleString = "Hello World";
        String concat = "Hello ";
        concat += "world";
        System.out.println(singleString == concat);//false, two different objects.


        String c = "Hello World";
        String d = new String("Hello World"); //Using the way, it created a new onject anyways.
        System.out.println( "New string: " + (c == d));//false, it created an object inneficiently

        //intern()
        String e = "Hello World";
        String f = new String("Hello World").intern();//We are telling java to use the pool.
        System.out.println( "Intern(): " + (e == f)); //true

        String first = "rat" + 1; // compile time constant
        String second = "r" + "a" + "t" + "1"; // compile time constant
        String third = "r" + "a" + "t" + new String("1"); //Having an object does
        // not make it compile time constant.
        System.out.println("first == second: " + (first == second) ); //true
        System.out.println("first == second.intern(): " + (first == second.intern()) );//true
        System.out.println("first == third: " + (first == third) ); //false
        System.out.println("first == third.intern(): " + (first == third.intern()) ); //true

    }
}
