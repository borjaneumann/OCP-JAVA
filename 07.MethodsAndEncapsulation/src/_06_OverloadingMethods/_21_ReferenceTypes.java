package _06_OverloadingMethods;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class _21_ReferenceTypes {
    /*
    what do you think this code outputs?
     */
    public void fly(String s) {
        System.out.print("string");
    }
    public void fly(Object o) {
        System.out.print("object");
    }
    public static void main(String[] args) {
        _21_ReferenceTypes r = new _21_ReferenceTypes();
        r.fly("test");
        System.out.print("-");
        r.fly(56);

        print("abc"); // String and StringBuilder implement the CharSequence interface.
        print(new ArrayList<>());
        print(LocalDate.of(2019, Month.JULY, 4));
    }
    public static void print(Iterable i) {
        System.out.print("I");
    }
    public static void print(CharSequence c) {
        System.out.print("C");
    }
    public static void print(Object o) {
        System.out.print("O");
    }


}
