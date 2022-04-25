package _6_WorkingWithGenerics._4_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _4_WildcardGenericType {
    /*
    By now, you might have noticed that generics don't seem particularly
    useful since they are treated as an Object and therefore don't have many
    methods available. Bounded wildcards solve this by restricting what types
    can be used in a wildcard. A bounded parameter type is a generic type that
    specifies a bound for the generic. Be warned that this is the hardest section
    in the chapter, so don't feel bad if you have to read it more than once.
    A wildcard generic type is an unknown generic type represented with a
    question mark ( ?). You can use generic wildcards in three ways,
     */

    //Types of bounds
    //Unbounded wildcard
    List<?> a = new ArrayList<String>();

    //Wildcard with an upper bound. Extends type
    List<? extends Exception> b = new ArrayList<RuntimeException>();

    //Wildcard with a lower bound
    List<? super Exception> c = new ArrayList<Object>();
}
