package _04_UnderstandingJavaArrays;

public class UsingAnArray {
    public static void main(String[] args) {
        String[] mammals = { "monkey", "chimp", "donkey"};
        System.out.println("Length: " + mammals.length);
        System.out.println("Mammals[0]: " + mammals[0]);
        System.out.println("Mammals[1]: " + mammals[1]);
        System.out.println("Mammals[2]: " + mammals[2]);
        mammals[2] = "lizzard";
        System.out.println("Mammals[2]: " + mammals[2]);

        String[] birds = new String[6];
        System.out.println("Length of birds: " + birds.length);

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length;i++){
            numbers[i]=i+5;
            System.out.println(numbers);
        }

    }
}
