package _1_UsingMethodReferences._01_CallingStaticMethods;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Example {

    //Sort from Collections is our static method.
    Consumer<List<Integer>> methodRef = Collections::sort;
    Consumer<List<Integer>> lambda = x-> Collections.sort(x);

}
