package _01_creating_And_Manipulating_Strings;

public class _01_Concatenation {
    /*
    There aren’t a lot of rules to know for this, but you have to know them well:

    1. If both operands are numeric, + means numeric addition.
    2. If either operand is a String, + means concatenation.
    3. The expression is evaluated left to right.
     */
    public static void main(String[] args) {
        //Both below are slightly different
        String nameA = "Alexander";
        String nameB = new String("Alexander");

        //concatenation is evaluated from left to right

        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); //ab
        System.out.println("a" + "b" + 2); //ab2
        System.out.println(1 + 2 + "c"); //3c
        System.out.println("c" + 1 + 2); //c12

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // It becomes a string 64

        String s = "1";
        s += "2";
        s += 3;
        System.out.println("concatenation with += : " + s); //123
    }
}
