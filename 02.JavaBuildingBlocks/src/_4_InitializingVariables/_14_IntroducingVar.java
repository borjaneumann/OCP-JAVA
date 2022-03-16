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

    VAR and NULL
    ------------
    While a var cannot be initialized with a null value without a type, it
    can be assigned a null value after it is declared, provided that the
    underlying data type of the var is an object. Take a look at the
    following code snippet:

    13: var n = "myData";
    14: n = null;
    15: var m = 4;
    16: m = null; // DOES NOT COMPILE

    It might surprise you to learn that a var can be initialized to a null
    value if the type is specified:
    17: var o = (String)null;

    package var;
    public class Var {
        public void var() {
            var var = "var"; //naming a var var is legal!
        }
        public void Var() {
            Var var = new Var(); // this is not a var but reference type called var
        }
    }

    There’s one last rule you should be aware of. While var is not a reserved
    word and allowed to be used as an identifier, it is considered a reserved
    type name. A reserved type name means it cannot be used to define a type,
    such as a class, interface, or enum. For example, the following code snippet
    does not compile because of the class name:

    public class var { // DOES NOT COMPILE
        public var() {
        }
    }




    */
}
