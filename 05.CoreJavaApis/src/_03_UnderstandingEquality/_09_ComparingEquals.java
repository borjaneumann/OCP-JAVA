package _03_UnderstandingEquality;

public class _09_ComparingEquals {
    public static void main(String[] args) {

        /* COMPARING EQUALS() AND ==
        Since this example isn’t dealing with primitives, we know to look for
        whether the references are referring to the same object.
         */

        // == (checking the reference)
        StringBuilder one = new StringBuilder("one");
        StringBuilder two = new StringBuilder("one");
        StringBuilder three = one.append("three");
        System.out.println(one == two); //false
        System.out.println(one == three); //true -> StringBuilder methods like to return the
        //current reference for chaining
        System.out.println("One: " + one);
        System.out.println("Three: " + three);
    }
}
