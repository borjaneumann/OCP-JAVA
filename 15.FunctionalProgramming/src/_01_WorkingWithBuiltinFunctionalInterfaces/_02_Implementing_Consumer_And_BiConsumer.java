package _01_WorkingWithBuiltinFunctionalInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _02_Implementing_Consumer_And_BiConsumer {

    //You use a Consumer when you want to do something with a parameter but
    //not return anything. BiConsumer does the same thing except that it takes
    //two parameters.
    public static void main(String[] args) {

        Consumer<String> c1 = System.out ::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie"); // Annie
        c2.accept("Annie"); // Annie

        /*This example prints Annie twice. BiConsumer is called with two
        parameters. They don't have to be the same type. For example, we can put
        a key and a value in a map using this interface:*/

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k,v) -> map.put(k,v);

        b1.accept("chicken", 7);
        b2.accept("chick",1);

        System.out.println(map); // {chicken=7, chick=1}

        //Another example
        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b3 = map1::put;
        BiConsumer<String, String> b4 = (k,v) -> map1.put(k,v);
        b3.accept("chicken","cluck");
        b3.accept("chick","tweep");
        System.out.println("Map1: " + map1); // {chicken=cluck, chick=tweep}
    }
}
