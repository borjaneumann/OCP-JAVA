public class StringBuiderMethods {
    public static void main(String[] args) {
        //charAt(), indexOf, length() and subString() like with String
        StringBuilder sb1 = new StringBuilder("papaya");
        char a = sb1.charAt(3);
        int number1 = sb1.indexOf("p");
        int length = sb1.length();
        String string1 = sb1.substring(2,5);


        System.out.println("chartAt is: " + a + " indexOf: "+ number1 + " length: " + length + " substring: "+ string1);

    }
}
