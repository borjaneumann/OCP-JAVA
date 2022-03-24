package _05_PassingDataAmongMethods;

public class _17_OtherLanguagesPassByReference {
   //PASS BY VALUE
    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2); // a: 2, b:1, temp: 1
        System.out.println(original1); // 1 IN PASS-BY-REFERENCE -> 2
        System.out.println(original2); // 2 IN PASS-BY-REFERENCE -> 1
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b:" + b + ", temp: " + temp);
    }

}
