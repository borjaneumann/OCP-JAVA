package javaFundamentals;

//As shown with the lemur variable, we don't need to assign a value when a
//final variable is declared. The rule is only that it must be assigned a value
//before it can be used.

public class ApplyingTheFinalModifierWrongOnVariables {
    private static void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
//        giraffe = 3; //It doesn't compile because the variaable was already declared.
//        System.out.println(giraffe + " " + lemur);
    }
    private static void cobraHss() {
        final  StringBuilder cobra = new StringBuilder();
        cobra.append("Hssssss");
        System.out.println(cobra);
        cobra.append("Hssssss!!!");
        System.out.println(cobra);
    }

    //Though final you can append.
    public static void main(String[] args) {
        printZooInfo(false);
        cobraHss();
    }
}
