package _03_workingWithVariablesInLambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class _09_ParameterList {
    /*
    Earlier in this chapter, you learned that specifying the type of parameters
    is optional. Additionally, var can be used in place of the specific type.
    That means that all three of these statements are interchangeable:

    Predicate<String> p = x -> true;
    Predicate<String> p = (var x) -> true;
    Predicate<String> p = (String x) -> true;

    The type of the lambda parameter is String
     */

    public void whatAmI(){
        consume((var x) -> System.out.println(x),123);
    }
    public void consume(Consumer<Integer> c, int num){
        c.accept(num);
    }

    public static void main(String[] args) {
        _09_ParameterList variablesInParameterList = new _09_ParameterList();
        variablesInParameterList.whatAmI();
    }

}
