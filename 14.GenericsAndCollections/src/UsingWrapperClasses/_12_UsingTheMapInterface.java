package UsingWrapperClasses;

import java.util.HashMap;
import java.util.Map;

public class _12_UsingTheMapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(101, "PP", 102, "QQ", 103, "RR");

        //easier to read
        Map<Integer, String> map1 = Map.ofEntries(
                Map.entry(1, "value1"),
                Map.entry(2, "value2")
        );

        //Map Methods

        //void clear() --> Removes all keys and values from the map.

        //boolean containsKey(Object key) --> Returns whether key is in map.

        //boolean containsValue(Object value) --> Returns whether value is in map.

        //Set<Map.Entry<K,V>> entrySet() --> Returns a Set of key/value pairs.

        //void forEach(BiConsumer(K key, V value)) --> Loop through each key/value pair.

        // V get(Object key) --> Returns the value mapped by key or null if none is mapped.

        // V getOrDefault(Object key, V defaultValue) --> Returns the value mapped by the key or the default value if none is mapped.

        // boolean isEmpty() --> Returns whether the map is empty.

        // Set<K> keySet() --> Returns set of all keys.

        // V merge(K key, V value, Function(<V, V, V> func)) --> Sets value if key not set. Runs the function if the key is set to determine the new value.
        // Removes if null.

        //V put(K key, V value) Adds or replaces key/value pair. Returns previous value or null.

        //V putIfAbsent(K key, V value) --> Adds value if key not present and returns null. Otherwise, returns existing value.

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

        //Treemap


    }

}
