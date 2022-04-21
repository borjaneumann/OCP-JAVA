package _1_UsingMethodReferences;

public class _05_ReviewingMethodReferences {
    /*
    Method references
    Type                        Before colon        After colon         Example
    =================================================================================
    Static methods              Class name          Method name         Collections::sort
    -------------------------------------------------------------------------------------
    Instance methods on a       Instance            Method name         str::startsWith
    particular object           variable name
    -------------------------------------------------------------------------------------
    Instance methods on a       Class name          Method name         String::isEmpty
    parameter
    -------------------------------------------------------------------------------------
    Constructor                 Class name          new                 ArrayList::new

    NUMBER OF PARAMETERS IN A METHOD REFERENCE
    We mentioned that a method reference can look the same even when
    it will behave differently based on the surrounding context. For
    example, given the following method:

    public class Penguin {
        public static Integer countBabies(Penguin… cuties)  {
            return cuties.length;
        }
    }
    we show three ways that Penguin::countBabies can be interpreted.
    This method allows you to pass zero or more values and creates an
    array with those values.

    10: Supplier<Integer> methodRef1 = Penguin::countBabies;
    11: Supplier<Integer> lambda1 = () -> Penguin.countBabies();
    12:
    13: Function<Penguin, Integer> methodRef2 = Penguin::countBabies;
    14: Function<Penguin, Integer> lambda2 = (x) -> Penguin.countBabies(x);
    15:
    16: BiFunction<Penguin, Penguin, Integer> methodRef3 = Penguin::countBabies;
    17: BiFunction<Penguin, Penguin, Integer> lambda3 =
    18: (x, y) -> Penguin.countBabies(x, y);

    Lines 10 and 11 do not take any parameters because the functional
    interface is a Supplier. Lines 13 and 14 take one parameter. Lines
    16 and 17 take two parameters. All six lines return an Integer from
    the method reference or lambda.

    There's nothing special about zero, one, and two parameters. If we
    had a functional interface with 100 parameters of type Penguin and
    the final one of Integer, we could still implement it with
    Penguin::countBabies.
     */
}
