package _3_functionalInterface.comparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String nameA = "Anthony";
        String nameB = "Robert";
        Comparator<Integer> ints = (i1,i2) -> i2-i1;
        System.out.println(compareInt(ints));
    }
    private static int compareInt(Comparator<Integer> comparator){
        return comparator.compare(40,32);
    }
}
