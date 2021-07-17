package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;

public class IntroducingMaps {
    public static void main(String[] args) {
        //Most common implementation is Hashmap
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("monkey", "banana");
        String food = map.get("koala");// bamboo
        String other = map.getOrDefault("ant", "leaf");//leaf
        for (String key: map.keySet()){
            System.out.println(key + " " + map.get(key)); //koala bamboo
        }
    }
}
