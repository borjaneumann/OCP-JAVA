public class Concatenation {
    public static void main(String[] args) {
        //Both below are slightly different
        String nameA = "Alexander";
        String nameB = new String("Alexander");

        //concatenation is evaluated from left to right

        System.out.println(1 + 2);
        System.out.println("a" + "b");
        System.out.println("a" + "b" + 2);
        System.out.println(1 + 2 + "c");
        System.out.println("c" + 1 + 2);

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // It becomes a string
    }
}
