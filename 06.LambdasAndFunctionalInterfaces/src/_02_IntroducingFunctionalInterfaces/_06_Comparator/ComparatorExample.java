package _02_IntroducingFunctionalInterfaces._06_Comparator;

import java.util.Comparator;

public class ComparatorExample {
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
