public class PrintingElementsInReverse {
    public static void main(String[] args) {

        for (int i = 5; i > -3; i--) {
            System.out.println(i);
        }
        String name = "Alexander";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
        for (int i = 8 - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
        System.out.println("Letter at index 5: " + name.charAt(5));
        

    }
}
