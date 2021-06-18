public class StringBuilderClass {
    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++){
            alpha += current;
        }
        System.out.println("Alpha: " + alpha);//from a to z

        StringBuilder beta = new StringBuilder();
        for (char current = 'a'; current <= 'z' ; current++)
            beta.append(current);
        System.out.println("Beta: " + beta);

    }
}
