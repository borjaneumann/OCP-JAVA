package UsingWrapperClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
        map7.replaceAll((k,v) -> k + v);



    }

}
