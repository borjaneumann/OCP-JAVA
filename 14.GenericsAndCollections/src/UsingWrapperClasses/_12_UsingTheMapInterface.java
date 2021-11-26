package UsingWrapperClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class _12_UsingTheMapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(101, "PP", 102, "QQ", 103, "RR");

        //easier to read
        Map<Integer, String> map1 = Map.ofEntries(
                Map.entry(1, "value1"),
                Map.entry(2, "value2")
        );

        // Map Methods

        // void clear() --> Removes all keys and values from the map.

        // boolean containsKey(Object key) --> Returns whether key is in map.

        // boolean containsValue(Object value) --> Returns whether value is in map.

        // Set<Map.Entry<K,V>> entrySet() --> Returns a Set of key/value pairs.

        // void forEach(BiConsumer(K key, V value)) --> Loop through each key/value pair.

        // V get(Object key) --> Returns the value mapped by key or null if none is mapped.

        // V getOrDefault(Object key, V defaultValue) --> Returns the value mapped by the key or the default value if none is mapped.

        // boolean isEmpty() --> Returns whether the map is empty.

        // Set<K> keySet() --> Returns set of all keys.

        // V merge(K key, V value, Function(<V, V, V> func)) --> Sets value if key not set. Runs the function if the key is set to determine the new value.
        // Removes if null.

        // V put(K key, V value) Adds or replaces key/value pair. Returns previous value or null.

        // V putIfAbsent(K key, V value) --> Adds value if key not present and returns null. Otherwise, returns existing value.

        // V remove(Object key) --> Removes and returns value mapped to key. Returns null if none.

        // V replace(K key, V value) --> Replaces the value for a given key if the key is set. Returns the original value or null if none.

        // void replaceAll(BiFunction<K, V, V> func) --> Replaces each value with the results of the function.

        // int size() --> Returns the number of entries (key/value pairs) in the map.

        // Collection<V>values() --> Returns Collection of all values.

        //Hashmap

        Map<String, String> map2 = new HashMap<>();
        map2.put("Koala", "Bamboo");
        map2.put("lion", "meat");
        map2.put("giraffe", "leaf");
        String food = map2.get("Koala"); //bamboo
        for (String key : map2.keySet()){
            System.out.println(key + ","); //koala, giraffa, lion
        }
        for (String value : map2.values()){
            System.out.println(value + ","); //Bamboo, leaf, meat
        }

        //Treemap
        Map<String, String> map4 = new TreeMap<>();
        map4.put("koala", "bamboo");
        map4.put("lion", "meat");
        map4.put("giraffe", "leaf");
        String food4 = map.get("koala"); // bamboo
        for (String key: map4.keySet()) {
            System.out.print(key + ","); // giraffe,koala,lion, the keys are sorted (in alphabetical order)

        }
//        System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map2.containsKey("lion")); // true
        System.out.println(map2.containsValue("lion")); // false
        System.out.println(map2.size()); // 3
        map2.clear();
        System.out.println(map2.size()); // 0
        System.out.println(map2.isEmpty()); // true

        //ForEach() and entrySet()
        //ForEach() the lambda used by the forEach()
        //method has two parameters; the key and the value.

        Map<Integer, Character> map5 = new HashMap<>();
        map5.put(1,'a');
        map5.put(2,'b');
        map5.put(3,'c');
        map5.forEach((k,v) ->System.out.println(v));

        //if you don't care about the key, this particular code could
        //have been written with the values() method and a method reference
        //instead

        map5.values().forEach(System.out::println);

        //Another way of going through all the data in a map is to get the key/value
        //pairs in a Set. Java has a static interface inside Map called Entry. It
        //provides methods to get the key and value of each pair.

        map5.entrySet().forEach(e -> System.out.println(e.getKey() + e.getValue()));

        //GetOrDefault()
        //The get() method returns null if the requested key is not in map.
        //Sometimes you prefer to have a different value returned. Luckily, the
        //getOrDefault() method makes this easy. Let's compare the two methods.

        Map<Character, String> map6 = new HashMap<>();
        map6.put('x',"spot");
        System.out.println("x marks the " + map6.get('x'));
        System.out.println("x marks the " + map6.getOrDefault('x',""));
        System.out.println("y marks the " + map6.get('y'));
        System.out.println("y marks the " + map6.getOrDefault('y',""));

        // replace() and replaceAll()
        //These methods are similar to the Collection version except a key is involved.

        Map<Integer, Integer> map7 = new HashMap<>();
        map7.put(1,2);
        map7.put(2,4);
        Integer original = map7.replace(2,10);  //4
        System.out.println(map7);  // {1=2  2=10}
        map7.replaceAll((k,v) -> k + v); // { 1=3 , 2=12 }
        System.out.println(map7);

        //putIfAbsent()
        //The putIfAbsent() method sets a value in the map but skips it if the value
        //is already set to a non‐ null value.

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "tram");
        favorites.putIfAbsent("Sam", "tram");
        favorites.putIfAbsent("Tom", "tram");
        System.out.println(favorites); //  {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

        //merge()
        //The merge() method adds logic of what to choose. Suppose we want to
        //choose the ride with the longest name. We can write code to express this
        //by passing a mapping function to the merge() method.

        BiFunction<String, String, String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites1 = new HashMap<>();
        favorites1.put("Jenny", "Bus Tour");
        favorites1.put("Tom", "Tram");
        String jenny = favorites1.merge("Jenny", "Skyride", mapper);
        String tom = favorites1.merge("Tom", "Skyride", mapper);
        System.out.println("After merge: " + favorites1); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        /*The merge() method also has logic for what happens if null values or
        missing keys are involved. In this case, it doesn't call the BiFunction at
        all, and it simply uses the new value.*/
        BiFunction<String, String, String> mapper1 = (v1, v2) -> v1.length()>v2.length() ? v1 : v2;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Sam", null);
        favorites2.merge("Tom", "Skyride", mapper1);
        favorites2.merge("Sam", "Skyride", mapper1);
        System.out.println(favorites2);//{Tom = Skyride, Sam = Skyride}

        //The final thing to know about merge() is what happens when the mapping
        //function is called and returns null. The key is removed from the map
        //when this happens:

        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Jenny", "Bus Tour");
        favorites3.put("Tom", "Bus Tour");
        favorites3.merge("Jenny", "Skyride", mapper2);
        favorites3.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites3); // {Tom=Bus Tour,Sam=Skyride}




}

}
