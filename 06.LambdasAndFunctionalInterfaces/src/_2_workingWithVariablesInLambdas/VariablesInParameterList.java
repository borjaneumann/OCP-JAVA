package _2_workingWithVariablesInLambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class VariablesInParameterList {
    //these 3 parameters are interchangeable
    Predicate<String> p = x -> true;
//    Predicate<String> p = (var x) -> true;
//    Predicate<String> p = (String s) -> true;

    public void whatAmI(){
        consume((var x) -> System.out.println(x),123);
    }
    public void consume(Consumer<Integer> c, int num){
        c.accept(num);
    }
    public static void main(String[] args) {
        VariablesInParameterList variablesInParameterList = new VariablesInParameterList();
        variablesInParameterList.whatAmI();
    }

}
