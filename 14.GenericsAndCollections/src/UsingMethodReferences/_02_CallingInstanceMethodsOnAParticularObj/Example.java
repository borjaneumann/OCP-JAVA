package UsingMethodReferences._02_CallingInstanceMethodsOnAParticularObj;

import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {
        var str = "abc";
        Predicate<String> methodRef = str::startsWith;
        Predicate<String> lambda = s -> str.startsWith(s);
    }


}
