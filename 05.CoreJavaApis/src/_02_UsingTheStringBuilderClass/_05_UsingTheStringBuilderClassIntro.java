package _02_UsingTheStringBuilderClass;

public class _05_UsingTheStringBuilderClassIntro {
    public static void main(String[] args) {

        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++){
            alpha += current;
            System.out.println(" ");
        }
        System.out.print("Alphabet (String): " + alpha);//from a to z. It creates 25 objects.
        System.out.println();

        StringBuilder beta = new StringBuilder();
        for (char current = 'a'; current <= 'z' ; current++)
            beta.append(current);
        System.out.println("Alphabet (StringBuilder): " + beta);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");

        System.out.println("sb:" + sb);
        System.out.println("Same: "+ same);//sb and same are pointing at the same object.

    }
}
