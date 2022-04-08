package _01_ApplyingTheFinalModifier;

public class _01_DeclaringFinalLocalVariables {
    /*
    From previous chapters, you should remember the final modifier can be
    applied to variables, methods, and classes.
    Marking a variable final means the value cannot be changed after it is assigned.
    Marking a method or class final means it cannot be overridden or extended, respectively.

    As shown with the lemur variable, we don't need to assign a value when a
    final variable is declared. The rule is only that it must be assigned a value
    before it can be used.
     */

        private static void printZooInfo(boolean isWeekend) {
            final int giraffe = 5;
            final long lemur;
            if(isWeekend) lemur = 5;
            else lemur = 10;
            System.out.println(giraffe + " " + lemur);
        }
        private static void printZooInfoNoCompiles(boolean isWeekend) {
            final int giraffe = 5;
            final long lemur;
            if(isWeekend) lemur = 5;
            //giraffe = 3;//initialized twice
           // System.out.println(giraffe + " " + lemur);//if false never gets initialized
        }

        public static void main(String[] args) {
            printZooInfo(false);
        }
        /*
        Just because a variable reference is marked final does not mean the
        object associated with it cannot be modified. Consider the following code
        snippet:

        final StringBuilder cobra = new StringBuilder();
        cobra.append("Hssssss");
        cobra.append("Hssssss!!!");

        In the cobra example, the object reference is constant, but that doesn't
        mean the data in the class is constant.
         */
}
