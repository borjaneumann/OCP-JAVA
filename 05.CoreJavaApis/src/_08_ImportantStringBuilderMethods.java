public class _08_ImportantStringBuilderMethods {
    public static void main(String[] args) {
        //charAt(), indexOf, length() and subString() like with String
        StringBuilder sb1 = new StringBuilder("papaya");
        char a = sb1.charAt(3);
        int number1 = sb1.indexOf("p");
        int length = sb1.length();
        String string1 = sb1.substring(2,5);

        System.out.println("sb1.chartAt(): " + "chartAt is: " + a + " sb1.indexOf(): "+ number1 + " sb1.length(): " + length +
                " sb1.substring():" +
                " "+ string1);

        //append()
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println("sb2.append(): " + sb2);

        //insert();
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7,"-");
        sb3.insert(0,"-");
        sb3.insert(4,"-");
        System.out.println("sb3.insert(): " + sb3);

        //delete and deleteChartAt()
        StringBuilder sb4 = new StringBuilder("abcdefgh");
        sb4.delete(2,3);
        sb4.deleteCharAt(4);
        System.out.println("sb4.delete and deleteChartAt: " + sb4);

        StringBuilder sb5 = new StringBuilder("abcdefgh");
        sb5.delete(3,100);
        System.out.println("sb5.delete(): " + sb5);

        //replace()
        StringBuilder sb6 = new StringBuilder("pigeon dirty");
        sb6.replace(3,6,"sty");
        System.out.println("sb6.replace(): " + sb6);
        sb6.replace(3,100,"");
        System.out.println("sb6.replace(): " + sb6);

        //reverse()
        StringBuilder sb7 = new StringBuilder("The next java class");
        sb7.reverse();
        System.out.println("sb7.reverse(): " + sb7);

        //toString()
        StringBuilder sb8 = new StringBuilder("The next java class");
        sb8.toString();
        System.out.println("sb8.toString(): " + sb8);




    }
}
