public class StringBuiderMethods {
    public static void main(String[] args) {
        //charAt(), indexOf, length() and subString() like with String
        StringBuilder sb1 = new StringBuilder("papaya");
        char a = sb1.charAt(3);
        int number1 = sb1.indexOf("p");
        int length = sb1.length();
        String string1 = sb1.substring(2,5);

        System.out.println("sb1: " + "chartAt is: " + a + " indexOf: "+ number1 + " length: " + length + " substring:" +
                " "+ string1);

        //append()
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println("sb2: " + sb2);

        //insert();
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7,"-");
        sb3.insert(0,"-");
        sb3.insert(4,"-");
        System.out.println("sb3: " + sb3);





    }
}
