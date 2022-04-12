package _04_UnderstandingInterfaceMembers._5_ReviewingInterfaceMethods;

public class _20_ReviewingInterfaceMembers {
    /*
    Interface member access
                            Accessible from     Accessible      Accessible from     Accessible
                            default and         from static     instance methods    outside the
                            private methods     methods         implementing or     interface
                            within the          within the      extending the       without an
                            interface           interface       interface?          instance of
                            definition?         definition?                         interface?
    ============================================================================================
    Constant variable       Yes                 Yes             Yes                 Yes
    --------------------------------------------------------------------------------------------
    abstract method         Yes                 No              Yes                 No
    --------------------------------------------------------------------------------------------
    default method          Yes                 No              Yes                 No
    --------------------------------------------------------------------------------------------
    private method          Yes                 No              No                  No
    --------------------------------------------------------------------------------------------
    static method           Yes                 Yes             Yes                 Yes
    --------------------------------------------------------------------------------------------
    private static method   Yes                 Yes             No                  No

    The first two data columns of Table 12.5 refer to access within the same
    interface definition. For example, a private method can access other
    private and private static methods defined within the same interface
    declaration.
    When working with interfaces, we consider abstract, default, and
    private interface methods as instance methods. With that thought in
    mind, the last two columns of Table 12.5 should follow from what you
    know about class access modifiers and private members. Recall that
    instance methods can access static members within the class, but static
    members cannot access instance methods without a reference to the
    instance. Also, private members are never inherited, so they are never
    accessible directly by a class implementing an interface.

    ABSTRACT CLASSES VS. INTERFACES
    ===============================
    By introducing six different interface member types, Java has
    certainly blurred the lines between an abstract class and an interface.
    A key distinction, though, is that interfaces do not implement
    constructors and are not part of the class hierarchy. While a class
    can implement multiple interfaces, it can only directly extend a
    single class.



     */
}
