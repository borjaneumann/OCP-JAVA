package UsingMethodReferences._03_CallingInstanceMethodsOnAParameter;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

//we are going to call an instance method that doesn't take any
//parameters
public class Example {

    Predicate<String> methodRef = String::isEmpty;
    Predicate<String> lambda = s -> s.isEmpty();

    BiPredicate<String, String> methodRef1 = String::startsWith;
    BiPredicate<String, String> lambda1 = (s, p) -> s.startsWith(p);



}
