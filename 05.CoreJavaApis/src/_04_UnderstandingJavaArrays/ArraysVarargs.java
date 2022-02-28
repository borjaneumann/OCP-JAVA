package _04_UnderstandingJavaArrays;

public class ArraysVarargs {
//    public static void main(String[] args);
//    public static void main(String args[]);
//    public static void main(String...args);

    //Onlu when passed in a method
    int result;

    static void display(int x, String... words) {
        System.out.println("The number is: " + x);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        display(500,"hello");
        display(25,"Hello", "there");
    }
}
