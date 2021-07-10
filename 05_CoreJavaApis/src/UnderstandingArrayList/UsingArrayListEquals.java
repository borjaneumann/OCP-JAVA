package UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListEquals {
    public static void main(String[] args) {

        //boolean equals(Object object);
        //Compare two lists to see whether they contain the same elements in the same order.

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two));//true
        one.add("a");
        System.out.println(one.equals(two));//false
        two.add("a");
        System.out.println(one.equals(two));//true
        one.add("b");
        two.add(0,"b");
        System.out.println(one.equals(two));//false
    }
}
