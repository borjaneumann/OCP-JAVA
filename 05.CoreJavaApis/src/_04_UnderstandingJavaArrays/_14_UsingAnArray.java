package _04_UnderstandingJavaArrays;

public class _14_UsingAnArray {
    public static void main(String[] args) {

        //Accessing an Array
        String[] mammals = { "monkey", "chimp", "donkey"};
        System.out.println("Length: " + mammals.length);// 3
        System.out.println("Mammals[0]: " + mammals[0]);// monkey
        System.out.println("Mammals[1]: " + mammals[1]);// chimp
        System.out.println("Mammals[2]: " + mammals[2]);// donkey
        mammals[2] = "lizzard";
        System.out.println("Mammals[2]: " + mammals[2]);// lizzard

        String[] birds = new String[6];
        //length does not consider what is in the array; it only
        //considers how many slots have been allocated.
        System.out.println("Length of birds: " + birds.length);// 6
        // length is not a method. Since arrays are fixed length defined at the time
        // they are instantiated, length is a public final field on the class.
        // There is no need to make it a method
        // since there is no calculation to be done at run time.

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length;i++){
            System.out.print((numbers[i]=i+5) + " ");// 5 6 7 8 9 10 11 12 13 14
        }
        numbers[10] = 3; //ArrayIndexOutOfBoundsException
        numbers[numbers.length] = 5; //ArrayIndexOutOfBoundsException
        for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;//ArrayIndexOutOfBoundsException <=
    }
}
