package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _21_CreatingAnArrayList {
    public static void main(String[] args) {

        //As with StringBuilder, there are three ways to create an ArrayList:
        //JAVA 5
        ArrayList list1 = new ArrayList();//freestyle
        ArrayList list2 = new ArrayList(10);//specific size
        ArrayList list3 = new ArrayList(list2);//We want to make a copy of another list

        //JAVA 8 (generics, which allow you to specify the type of class that the
        //ArrayList will contain.)
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();//diamond operator empty, also ok

        //Using VAR with ArrayList
        var strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        for ( String s: strings) {
            System.out.println(s);
        }
        //but...
        var list = new ArrayList<>();//it assumes Object as ultimate super class
        list.add("c");
        list.add("d");
//        for (String s: list)//Dont compile
        for (Object o : list) //in the loop, we need to use the Object type rather than String.

        //See how to output values below
        System.out.println(strings.toString());
        System.out.println(strings);

        /*List (ArrayList implements an interface called List.)
        An ArrayList is a List.you can store an ArrayList in a List reference variable but not vice versa.
        The reason is that List is an interface and interfaces can’t be instantiated.*/
        List<String> list6 = new ArrayList<>();
        //ArrayList <String> list7 = new List<String>();//cannot be instantiated.ArrayList cannot contain a list
    }
}
