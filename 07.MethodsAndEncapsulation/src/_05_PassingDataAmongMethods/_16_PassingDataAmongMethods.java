package _05_PassingDataAmongMethods;

public class _16_PassingDataAmongMethods {
    /*
    Java is a “pass-by-value” language. This means that a copy of the variable
    is made and the method receives that copy. Assignments made in the
    method do not affect the caller. Let’s look at an example:

    To review, Java uses pass-by-value to get data into a method. Assigning a
    new primitive or reference to a parameter doesn’t change the caller.
    Calling methods on a reference to an object can affect the caller.

    If the returned value is not used, the result is ignored.
    Remember that this is happening because of the returned value
    and not the method parameter.
     */
    public static void main(String[] args) {
        //PRIMITIVE EXAMPLE
        int num = 4; // A copy of number 4 is done and passed onto the method.
        newNumber(num); // 8
        System.out.println("Num: " + num); // 4

        // REFERENCE EXAMPLE
        String name = "Webby";
        speak(name); // Sparky
        System.out.println("Name: " + name); // Name: Webby

        // REFERENCE EXAMPLE
        StringBuilder nameSb = new StringBuilder("Tim and ");
        append(nameSb); //it doesnt reassign name to a different object
        System.out.println("NameSb: " + nameSb); // Tim and Johnny

        //Ignored returned values are tricky
        int number = 1; //number=1
        String letters = "abc"; //letters=abc
        number(number); //number=1
        int newNumber = number(number);
        System.out.println("New number: "+ newNumber); // newNumber = 2
        letters = letters(letters); //letters=abcd
        System.out.println(number +letters); // 1abcd
    }
    public static void newNumber(int num) {
        num = 8;
        System.out.println(num);// num here and in the main just happen to be the same. coincidence!!
    }
    public static void speak(String name) {
        name = "Sparky";
        System.out.println(name);
    }
    public static void append(StringBuilder s) {
        s.append("Johnny");
        System.out.println(s); // s and nameSb point to the same object
    }
    public static int number(int number) {
        number++;
        return number;
    }
    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
