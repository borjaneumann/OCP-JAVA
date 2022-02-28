package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingAnArrayListAdd {
    public static void main(String[] args) {
        //ArrayList implements TpString

        //add
        //Signature
        //boolean add ( E element);
        //void add(int index, E element);

        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("sparrow");
        //list2.add(Boolean.TRUE); doesnt compile
        System.out.println(list2);

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println("birds: " + birds); //Pay attention to how it pushes elements and when they are added.



    }


}
