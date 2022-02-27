package _02_UsingTheStringBuilderClass;

public class _08_ImportantStringBuilderMethods {
    public static void main(String[] args) {

        //charAt(), indexOf, length() and subString() like with String
        StringBuilder sb1 = new StringBuilder("papaya");
        char a = sb1.charAt(3);
        int number1 = sb1.indexOf("p");
        int length = sb1.length();
        String string1 = sb1.substring(2,5);

        System.out.println("sb1.chartAt(): \n" + "chartAt is: " + a + "\nsb1.indexOf(): "+ number1 + "\nsb1.length()" +
                ":" +
                " " + length +
                "\nsb1.substring():" +
                " "+ string1);

        //append()
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println("sb2.append(): " + sb2); //1c-true

        //insert();
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7,"-"); //animals-
        sb3.insert(0,"-"); //=animals-
        sb3.insert(4,"-"); //-ani-mals-
        System.out.println("sb3.insert(): " + sb3); //-ani-mals-

        //delete and deleteChartAt()
        StringBuilder sb4 = new StringBuilder("abcdefgh");
        sb4.delete(2,3); //abdefgh
        sb4.deleteCharAt(4); //abdegh
        System.out.println("sb4.delete and deleteChartAt: " + sb4); //abdegh

        StringBuilder sb5 = new StringBuilder("abcdefgh");
        sb5.delete(3,100); //No null pointer
        System.out.println("sb5.delete(): " + sb5); //abc

        //replace()
        StringBuilder sb6 = new StringBuilder("pigeon dirty");
        sb6.replace(3,6,"sty");
        System.out.println("sb6.replace(): " + sb6);//pigsty dirty
        sb6.replace(3,100,"");
        System.out.println("sb6.replace(): " + sb6); //pig

        //reverse()
        StringBuilder sb7 = new StringBuilder("The next java class");
        sb7.reverse();
        System.out.println("sb7.reverse(): " + sb7);//ssalc avaj txen ehT

        //toString()
        StringBuilder sb8 = new StringBuilder("The next java class");
        sb8.toString();
        System.out.println("sb8.toString(): " + sb8);




    }
}
