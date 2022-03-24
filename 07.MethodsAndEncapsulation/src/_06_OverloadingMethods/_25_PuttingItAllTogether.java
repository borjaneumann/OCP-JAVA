package _06_OverloadingMethods;

public class _25_PuttingItAllTogether {
    /*
    Java calls the most specific method it can. When some of the types
    interact, the Java rules focus on backward compatibility. A long time ago,
    autoboxing and varargs didn’t exist. Since old code still needs to work,
    this means autoboxing and varargs come last when Java looks at
    overloaded methods.

    The order that Java uses to choose the right overloaded method
    Rule                        Example of what will be chosen for glide(1,2)
    =======================================================================
    Exact match by type         String glide(int i, int j)
    Larger primitive type       String glide(long i, long j)
    Autoboxed type              String glide(Integer i, Integer j)
    Varargs                     String glide(int... nums)
     */
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
        //only one conversion!!
//        play(4); // DOES NOT COMPILE Java is happy to convert the int 4 to a long 4 or
        //an Integer 4. It cannot handle converting to a long and then to a Long.
        play(4L); // calls the Long versio
    }
    public static void play(Long l) {}
    public static void play(Long... l) {}


}
