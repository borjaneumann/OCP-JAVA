package UsingMethodReferences._04_CallingConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CallingConstructors {

    Supplier<List<String>> methodRef = ArrayList::new;
    Supplier<List<String>> lambda = () -> new ArrayList();

}
