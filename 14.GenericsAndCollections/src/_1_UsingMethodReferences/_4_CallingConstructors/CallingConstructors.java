package _1_UsingMethodReferences._04_CallingConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class CallingConstructors {

    Supplier<List<String>> methodRef = ArrayList::new;
    Supplier<List<String>> lambda = () -> new ArrayList();

    Function<Integer, List<String>> methodRef1 =
            ArrayList::new;
    Function<Integer, List<String>> lambda1 = x -> new
            ArrayList(x);

}
