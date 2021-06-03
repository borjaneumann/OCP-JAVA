public class PrintingElementsInReverse {
    public static void main(String[] args) {

        for (int i = 5; i > -3; i--) {
            System.out.println(i);
        }
        String name = "Alexander";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("Letter at index 5: " + name.charAt(5));
        

    }
}
