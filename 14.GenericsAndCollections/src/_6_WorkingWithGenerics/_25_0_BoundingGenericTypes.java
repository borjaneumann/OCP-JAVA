package _6_WorkingWithGenerics;

public class _25_0_BoundingGenericTypes {
    /*
    By now, you might have noticed that generics don't seem particularly
    useful since they are treated as an Object and therefore don't have many
    methods available. Bounded wildcards solve this by restricting what types
    can be used in a wildcard. A bounded parameter type is a generic type that
    specifies a bound for the generic. Be warned that this is the hardest section
    in the chapter, so don't feel bad if you have to read it more than once.
    A wildcard generic type is an unknown generic type represented with a
    question mark ( ?). You can use generic wildcards in three ways, as shown
    in Table 14.14. This section looks at each of these three wildcard types.

    TABLE 14.14 Types of bounds
    Type of bound                   Syntax          Example
    ==========================================================================================================
    Unbounded   wildcard            ?               List<?> a = new ArrayList<String>();
    Wildcard with an upper bound    ? extends type  List<? extends Exception> a = new ArrayList<RuntimeException>();
    Wildcard with a lower bound     ? super type    List<? super Exception> a = new ArrayList<Object>();
     */
}
