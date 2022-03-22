package _03_workingWithVariablesInLambdas;

import java.util.function.Consumer;

public class _11_VariablesReferencesFromTheLambdaBody {
    /*
    Lambda bodies are allowed to reference some variables from the
    surrounding code. The following code is legal:
    */
    public class Crow {
        private String color;

        public void caw(String name) {
            String volume = "loudly";
            Consumer<String> consumer = s ->
                    System.out.println(name + " says " + volume + " that she is " + color);
        }
    }

    /*
    This shows that lambda can access an instance variable, method
    parameter, or local variable under certain conditions. Instance variables
    (and class variables) are always allowed.

    Method parameters and local variables are allowed to be referenced if they
    are effectively final.
    public class Crow {
        private String color;
        public void caw(final String name) {
            final String volume = "loudly";
            Consumer<String> consumer = s ->
            System.out.println(name + " says "
            + volume + " that she is " + color);
        }
    }

    Two compile errors:
    public class Crow2 {
        private String color;

        public void caw(String name) {
            String volume = "loudly";
            name = "Caty";
            color = "black";

            Consumer<String> consumer = s ->
                    System.out.println(name + " says "
                            + volume + " that she is " + color);
            volume = "softly";
        }
    }
     */
}
