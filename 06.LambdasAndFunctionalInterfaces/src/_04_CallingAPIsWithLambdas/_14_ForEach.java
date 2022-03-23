package _04_CallingAPIsWithLambdas;

import java.util.*;

public class _14_ForEach {
    /*
    Our final method is forEach().
    It takes a Consumer and calls that lambda for each element encountered.
     */
    public static void main(String[] args) {
        //List
        List<String> names = new ArrayList<>();
        names.add("Robert");
        names.add("James");
        names.add("Michael");
        names.add("William");
        names.forEach(b-> System.out.println(b.charAt(3))); // e, e, h , l
        names.forEach(b-> System.out.println(b)); // Robert, James, Michael, William (one entry per line)
        System.out.println(names); // [Robert, James, Michael, William]

        // Sets (like List)
        Set<String> countries = Set.of("Vietnam", "Japan", "Iceland");
        countries.forEach(c-> System.out.println(c.length()));

        // Maps
        Map<String, Integer> countriesPerContinent = new HashMap<>();
        countriesPerContinent.put("Asia", 49);
        countriesPerContinent.put("Africa", 54);
        countriesPerContinent.put("Europe", 51);
        countriesPerContinent.put("America",34);
        countriesPerContinent.put("Oceania",14);
        //FOREACH IS APPLIED ON KEYSET() OR VALUES()
        countriesPerContinent.keySet().forEach(A-> System.out.println(A));// only country names
        countriesPerContinent.values().forEach(v-> System.out.println(v));// only country amounts

        //USING FOREACH WITH A MAP DIRECTLY
        countriesPerContinent.forEach((a,b)-> System.out.println(a + "," + b)); // All together

    }
}
