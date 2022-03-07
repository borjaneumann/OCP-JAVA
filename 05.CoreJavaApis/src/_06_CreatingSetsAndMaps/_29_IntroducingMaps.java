package _06_CreatingSetsAndMaps;

import java.util.HashMap;
import java.util.Map;

public class _29_IntroducingMaps {
    public static void main(String[] args) {
        /*
        A Map uses a key to identify values. For example, when you use the
        contact list on your phone, you look up “George” rather than looking
        through each phone number in turn.

        Most common implementation is Hashmap

        Common Map methods (8)
        Method                      Description
        ======================================================================================
        V get(Object key)           Returns the value mapped by key or null if none is mapped
        --------------------------------------------------------------------------------------
        V getOrDefault(Object       Returns the value mapped by key or other if none is mapped
        key, V other)
        --------------------------------------------------------------------------------------
        V put(K key, V value)       Adds or replaces key/value pair. Returns previous value or null
        --------------------------------------------------------------------------------------
        V remove(Object key)        Removes and returns value mapped to key. Returns null if none
        --------------------------------------------------------------------------------------
        boolean containsKey(Object  Returns whether key is in map
        key)
        ---------------------------------------------------------------------------------------
        boolean containsValue       Returns whether value is in map
        (Object value)
        ---------------------------------------------------------------------------------------
        Set<K> keySet()             Returns set of all keys
        ---------------------------------------------------------------------------------------
        Collection<V> values()      Returns Collection of all values
         */

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        System.out.println(map);
        map.put("monkey", "banana");
        System.out.println(map);
        String food = map.get("koala");// bamboo -> returns the value of the key
        System.out.println("food: " + food);
        String other = map.getOrDefault("ant", "leaf");//leaf
        System.out.println("other: " + other);
        for (String key: map.keySet()){
            System.out.println(key + " " + map.get(key)); //koala bamboo
        }
    }
}
