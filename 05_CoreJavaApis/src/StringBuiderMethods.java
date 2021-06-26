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

        //delete and deleteChartAt()
        StringBuilder sb4 = new StringBuilder("abcdefgh");
        sb4.delete(2,3);
        sb4.deleteCharAt(4);
        System.out.println("sb4: " + sb4);

        StringBuilder sb5 = new StringBuilder("abcdefgh");
        sb5.delete(3,100);
        System.out.println("sb5: " + sb5);

        //replace()
        StringBuilder sb6 = new StringBuilder("pigeon dirty");
        sb6.replace(3,6,"sty");
        System.out.println("Replace(): " + sb6);
        sb6.replace(3,100,"");
        System.out.println("Replace(): " + sb6);

        //reverse()
        StringBuilder sb7 = new StringBuilder("The next java class");
        sb7.reverse();
        System.out.println("Reverse(): " + sb7);




    }
}
