package _05_IntroducingFunctionalProgramming._05_WorkingWithLambdaVariables;

//import java.util.function.Predicate;
//
//public class VariablesReferencedFromLambdaBody {
//    private String color;
//    public void caw(String name) {
//        String volume = "loudly";
//        Predicate<String> p = s ->
//                (name + volume + color).length() == 10;
//    }

    //The version below will not compile. variables are redeclared.
//    private String color2;
//    public void caw2(String name2) {
//        String volume2 = "loudly";
//        color2 = "allowed";
//        name2 = "not allowed";
//        volume2 = "not allowed";
//        Predicate<String> p = s -> (name2 + volume2 + color2 ).length() == 9; //Does not compile
//    }
//}
