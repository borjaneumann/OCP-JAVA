package _01_DesigningMethods;

public class _03_ReturnType {
    /*
    The next item in a method declaration is the return type.
    The return type might be an actual Java type such as String or int.
    If there is no return type, the void keyword is used.
    This special return type comes from the English language:
    void means without contents. In Java, there is no type there.

    You cannot omit the return type.

    Can you explain why these methods compile or don’t?

    public void walk1() {}
    public void walk2() { return; }
    public String walk3() { return ""; }
    public String walk4() {} // DOES NOT COMPILE
    public walk5() {} // DOES NOT COMPILE
    public String int walk6() { } // DOES NOT COMPILE
    String walk7(int a) { if (a == 4) return ""; } // DOES NOT COMPILE

    The walk7() method is a little tricky. There is a return statement, but it
    doesn’t always get run. If a is 6, the return statement doesn’t get
    executed. Since the String always needs to be returned, the compiler
    complains.

    When returning a value, it needs to be assignable to the return type.
     */
    int integer() {
        return 9;
    }
//    int longMethod() {
//        return 9L; // DOES NOT COMPILE
//    }
}
