package _03_CreatingNestedClasses;

public class _12_DefiningAnAnonymousClass {
    /*
    An anonymous class is a specialized form of a local class that does not
    have a name. It is declared and instantiated all in one statement using the
    new keyword, a type name with parentheses, and a set of braces {}.
    Anonymous classes are required to extend an existing class or implement
    an existing interface. They are useful when you have a short
    implementation that will not be used anywhere else. Here's an example:

    1: public class ZooGiftShop {
    2:      abstract class SaleTodayOnly {
    3:          abstract int dollarsOff();
    4:      }
    5:      public int admission(int basePrice) {
    6:          SaleTodayOnly sale = new SaleTodayOnly() {
    7:              int dollarsOff() { return 3; }
    8:          }; // Don't forget the semicolon!
    9:          return basePrice - sale.dollarsOff();
    10: } }

    Lines 2 through 4 define an abstract class. Lines 6 through 8 define the
    anonymous class. Notice how this anonymous class does not have a name.
    The code says to instantiate a new SaleTodayOnly object. But wait,
    SaleTodayOnly is abstract. This is OK because we provide the class
    body right there—anonymously. In this example, writing an anonymous
    class is equivalent to writing a local class with an unspecified name that
    extends SaleTodayOnly and then immediately using it.
    Pay special attention to the semicolon on line 8. We are declaring a local
    variable on these lines.

    1: public class ZooGiftShop {
    2:      interface SaleTodayOnly {
    3:      int dollarsOff();
    4:      }
    5:      public int admission(int basePrice) {
    6:      SaleTodayOnly sale = new SaleTodayOnly() {
    7:          public int dollarsOff() { return 3; }
    8:      };
    9:      return basePrice - sale.dollarsOff();
    10: } }

    The most interesting thing here is how little has changed. Lines 2 through
    4 declare an interface instead of an abstract class. Line 7 is public
    instead of using default access since interfaces require public methods.
    And that is it. The anonymous class is the same whether you implement an
    interface or extend a class! Java figures out which one you want
    automatically. Just remember that in this second example, an instance of a
    class is created on line 6, not an interface.

    But what if we want to implement both an interface and extend a class?
    You can't with an anonymous class, unless the class to extend is
    java.lang.Object. The Object class doesn't count in the rule. Remember
    that an anonymous class is just an unnamed local class. You can write a
    local class and give it a name if you have this problem.

    There is one more thing that you can do with anonymous classes. You can
    define them right where they are needed, even if that is an argument to
    another method.

    1: public class ZooGiftShop {
    2:      interface SaleTodayOnly {
    3:      int dollarsOff();
    4:      }
    5:      public int pay() {
    6:          return admission(5, new SaleTodayOnly() {
    7:              public int dollarsOff() { return 3; }
    8:          });
    9:      }
    10:     public int admission(int basePrice, SaleTodayOnly sale)
    11:         {return basePrice - sale.dollarsOff();
    12: }}

    Lines 6 through 8 are the anonymous class. We don't even store it in a
    local variable. Instead, we pass it directly to the method that needs it.
    Reading this style of code does take some getting used to. But it is a
    concise way to create a class that you will use only once.

    You can even define anonymous classes outside a method body. The
    following may look like we are instantiating an interface as an instance
    variable, but the {} after the interface name indicates that this is an
    anonymous inner class implementing the interface.

    public class Gorilla {
        interface Climb {}
        Climb climbing = new Climb() {};
    }

``
     */
}
