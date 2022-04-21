package _1_UsingMethodReferences._2_CallingInstanceMethodsOnAParticularObj;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {

    public static void main(String[] args) {
        var str = "abc";
        Predicate<String> methodRef = str::startsWith;
        Predicate<String> lambda = s -> str.startsWith(s);

        //A method reference doesn't have to take any parameters.
        var random =  new Random();
        Supplier<Integer> methodRef1 = random::nextInt;
        Supplier<Integer> lambda1 = () -> random.nextInt();

    }


}
