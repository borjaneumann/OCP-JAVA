package _06_OverloadingMethods;

public class _22_Primitives {
    /*
    Primitives work in a way that’s similar to reference variables. Java tries to
    find the most specific matching overloaded method. What do you think happens here?
    */
        public void fly(int i) {
            System.out.print("int"); // long-long if commented out/ int fits in a long.
                                     // if we go from greater to smaller we have to explicitly cast
        }
        public void fly(long l) {
            System.out.print("long");
        }
        public static void main(String[] args) {
            _22_Primitives p = new _22_Primitives();
            p.fly(123);
            System.out.print("-");
            p.fly(123L);
        }
}
