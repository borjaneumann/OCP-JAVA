package _5_ManagingVariableScope;

public class _19_ApplyingScopeToClasses {
    /*
    Instance variables are available as soon as they are defined and last for the entire
    lifetime of the object itself.

    Class, aka static go into scope when declared like the other variable types.
    However, they stay in scope for the entire life of the program.

    1: public class Mouse {
    2:      final static int MAX_LENGTH = 5; //class variable
    3:      int length;                      //instance variable
    4:      public void grow(int inches) {   // local variable
    5:          if (length < MAX_LENGTH) {
    6:              int newSize = length + inches; // local variable
    7:              length = newSize;
    8:          }
    9:      }
    10: }


     */

}
