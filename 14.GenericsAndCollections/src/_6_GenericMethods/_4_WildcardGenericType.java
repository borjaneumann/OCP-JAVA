package _6_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _4_WildcardGenericType {

    //Types of bounds
    //Unbounded wildcard
    List<?> a = new ArrayList<String>();

    //Wildcard with an upper bound. Extends type
    List<? extends Exception> b = new ArrayList<RuntimeException>();

    //Wildcard with a lower bound
    List<? super Exception> c = new ArrayList<Object>();
}
