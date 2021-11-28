package _2_UsingWrapperClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _03_UsingDiamondOperator {
    public static void main(String[] args) {

        //In the past we would write a lot of duplicate code
        List<Integer> list = new ArrayList<Integer>();
        Map<String,Integer> map = new HashMap<String,Integer>();

        //often the generic types for both sides of the expression are identical.
        //With the diamond operator
        List<Integer> list1 = new ArrayList<>();
        Map<String,Integer> map1 = new HashMap<>();
        Map<Long,List<Integer>> mapOfLists1 = new HashMap<>();

        //Does not compile
//        List<> list2 = new ArrayList<Integer>(); // DOES NOT COMPILE
//        Map<> map2 = new HashMap<String, Integer>(); // DOES NOT COMPILE
        class InvalidUse {
//            void use(List<> data) {} // DOES NOT COMPILE
        }

        //Diamond opertators and var
        var list3 = new ArrayList<Integer>(); //creates a ArrayLIst of Integer
        var list4 = new ArrayList<>(); //creates a ArrayLIst of Object




    }
}
