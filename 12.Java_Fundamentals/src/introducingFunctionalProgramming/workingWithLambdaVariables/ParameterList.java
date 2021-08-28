package introFunctionalProgramming.workingWithLambdaVariables;

import java.util.List;
import java.util.function.Predicate;

//The exam might ask you to identify the type of the lambda parameter. In
//the previous example, the answer is String. OK, but how did we figure
//that out? A lambda infers the types from the surrounding context.

public class ParameterList {
    Predicate<String> p = x -> true;
    Predicate<String> q = (var x) -> true;
    Predicate<String> r = (String x) -> true;


    //Method signature. Expects integer
    public void whatAmI() {
        test((var x) -> x > 2, 123);
    }
    public void test(Predicate<Integer>c, int num) {
        c.test(num);
    }
    //Here we use the type of the list
    public void counts(List<Integer> list) {
        list.sort((var x, var y)-> x.compareTo(y));
    }

}
