package _5_SortingData;

public class CastingToCompareToArgument implements Comparable {
    private String name;
    @Override
    public int compareTo(Object o) {
        CastingToCompareToArgument d = (CastingToCompareToArgument) o; // cast because no generics
        return name.compareTo(d.name);
    }

    //Since we don't specify a generic type for Comparable, Java assumes that
    //we want an Object, which means that we have to cast to LegacyDuck
    //before accessing instance variables on it.
}
