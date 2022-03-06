package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_1_UsingAnArrayListAdd {
    public static void main(String[] args) {
        //ArrayList implements ToString
        /*E is used by convention in generics to mean “any class that this array can
        hold.” If you didn’t specify a type when creating the ArrayList, E means
        Object. Otherwise, it means the class you put between < and >.
         */

        //boolean add ( E element); Always returns true
        //void add(int index, E element);

        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list); //[hawk, true]

        //With Generics
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("sparrow");
        //list2.add(Boolean.TRUE); doesnt compile
        System.out.println(list2);//[sparrow]

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // hawk
        birds.add(1, "robin");// hawk, robin
        birds.add(0, "blue jay");//blue jay, hawk, robin
        birds.add(1, "cardinal");//blue jay, cardinal, hawk, robin
        System.out.println("birds: " + birds);//birds: [blue jay, cardinal, hawk, robin]
        //Pay attention to how it pushes elements when they are added. It does not replace them.



    }


}
