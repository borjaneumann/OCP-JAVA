package _03_CreatingNestedClasses;

public class _11_WritingALocalClass {
    /*
    A local class is a nested class defined within a method, constructors and initilizers.
    Like local variables, a local class declaration does not exist until the method is
    invoked, and it goes out of scope when the method returns. This means
    you can create instances only from within the method. Those instances can
    still be returned from the method. This is just how local variables work.

    Local classes have the following properties:
    - They do not have an access modifier.
    - They cannot be declared static and cannot declare static fields or
         methods, except for static final fields.
    - They have access to all fields and methods of the enclosing class
        (when defined in an instance method).
    - They can access local variables if the variables are final or
        effectively final. A simple test for effectively final is to add the
        final modifier to the local variable declaration. If it still compiles,
        then the local variable is effectively final.

    Here's a complicated way to multiply two numbers:
    1: public class PrintNumbers {
    2:      private int length = 5;
    3:      public void calculate() {
    4:          final int width = 20;
    5:          class MyLocalClass {
    6:              public void multiply() {
    7:              System.out.print(length * width);
    8:              }
    9:          }
    10:     MyLocalClass local = new MyLocalClass();
    11:     local.multiply();
    12: }
    13: public static void main(String[] args) {
    14:     PrintNumbers outer = new PrintNumbers();
    15:     outer.calculate();
    16:     }
    17: }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
        width = 2;
    }
    The length and height variables are final and effectively final,
    respectively, so neither causes a compilation issue. On the other hand, the
    width variable is reassigned during the method so it cannot be effectively
    final. For this reason, the local class declaration does not compile.




     */
}
