package javaFundamentals;

//As shown with the lemur variable, we don't need to assign a value when a
//final variable is declared. The rule is only that it must be assigned a value
//before it can be used.

public class ApplyingTheFinalModifierOnVariables {
    private static void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe + " " + lemur);
    }

    public static void main(String[] args) {
        printZooInfo(false);
    }
}
