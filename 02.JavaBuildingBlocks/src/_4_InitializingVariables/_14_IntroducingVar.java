package _4_InitializingVariables;

public class _14_IntroducingVar {
    /*
    Starting in Java 10, you have the option of using the keyword var instead
    of the type for local variables under certain conditions. To use this feature,
    you just type var instead of the primitive or reference type. Here’s an
    example:

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }
    The formal name of this feature is local variable type inference.


    //var tricky = "Hello"; DOES NOT COMPILE it is not used as a local variable!!

    Type Inference of var
    ---------------------
    When you type var, you are instructing the compiler to determine the type for you.

    7: public void reassignment() {
    8:  var number = 7;
    9:  number = 4;
    10: number = "five"; // DOES NOT COMPILE
    11: }

    The value for a var can change after it is declared but the type
    never does.

    If you know a language like JavaScript, you might be expecting var
    to mean a variable that can take on any type at runtime. In Java, var
    is still a specific type defined at compile time. It does not change
    type at runtime.

    Exam tricking you!
    -----------------
    3: public void doesThisCompile(boolean check) {
    4:      var question;
    5:      question = 1;
    6:      var answer; // DOES NOT COMPILE!! Remember that for local variable type
                            inference, the compiler looks only at the line with the declaration.
    7:      if (check) {
    8:          answer = 2;
    9:      } else {
    10:         answer = 3;
    11:     }
    12:     System.out.println(answer);
    13: }

    Java does not allow var in multiple variable declarations. The designers of Java decided it would be
    better not to allow var for null than to have to guess at intent.

    4: public void twoTypes() {
    5:      int a, var b = 3; // DOES NOT COMPILE
    6:      var n = null; // DOES NOT COMPILE
    7: }

    */
}
