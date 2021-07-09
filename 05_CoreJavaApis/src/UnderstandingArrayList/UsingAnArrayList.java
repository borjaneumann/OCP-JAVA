package UnderstandingArrayList;

import java.util.ArrayList;

public class UsingAnArrayList {
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


    }


}
