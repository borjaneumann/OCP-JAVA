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
        s2.concat("3");//it doesnt add. It is immutable. It is not the same as +=
        System.out.println(s2);

        String str = "Winnie"; // Winnie is now a candidate to the garbage collection.
        str+=" de bear";
        str.concat(" does not add this");
        System.out.println("str: " + str);

    }



}

