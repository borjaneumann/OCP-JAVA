package UsingWrapperClasses;

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
    }

}
