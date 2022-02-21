package _01_creating_And_Manipulating_Strings;

public class _02_StringImmutable {
    public static void main(String[] args) {
    String a = "abc";
    String b = a.toUpperCase();
    b = b.replace("B","2").replace( 'C', '3');
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        System.out.println();

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");//it doesnt add. It is immutable. It is ont the same as +=
        System.out.println(s2);
    }



}

