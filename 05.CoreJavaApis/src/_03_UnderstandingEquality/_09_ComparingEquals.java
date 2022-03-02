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

        // equals()  logical equality rather than object equality for String objects:
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println("Are x and z equal?: " + x.equals(z)); // true

        /*This works because the authors of the String class implemented a
        standard method called equals to check the values inside the String
        rather than the string reference itself. If a class doesn’t have an equals
        method, Java determines whether the references point to the same object
        —which is exactly what == does.

        In case you are wondering, the authors of StringBuilder did not
        implement equals(). If you call equals() on two StringBuilder
        instances, it will check reference equality. You can call toString() on
        StringBuilder to get a String to check for equality instead.
         */
    }
    //The exam will try to trick you!
    static class Tiger {
        String name;
        public static void main(String[] args) {
            _09_ComparingEquals.Tiger t1 = new _09_ComparingEquals.Tiger();
            _09_ComparingEquals.Tiger t2 = new _09_ComparingEquals.Tiger();
            _09_ComparingEquals.Tiger t3 = t1;
            System.out.println(t1 == t3); // true
            System.out.println(t1 == t2); // false
            System.out.println(t1.equals(t2)); // false, Tiger doesn't implement equal like String.

            //The exam will try to trick you!
            String string = "a";
            StringBuilder builder = new StringBuilder("a");
//            System.out.println(string == builder); //DOES NOT COMPILE
            /*
            The compiler is smart enough to know that two references can’t possibly point to the
            same object when they are completely different types.
             */
        }
    }
}