package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _21_CreatingAnArrayList {
    public static void main(String[] args) {

        //Java 5
        //freestyle
        ArrayList list1 = new ArrayList();

        //specific size
        ArrayList list2 = new ArrayList(10);

        //We want to make a copy of another list
        ArrayList list3 = new ArrayList(list2);

        //Java 8
        //generics
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();//diamond operator empty, also ok

        //List
        List<String> list6 = new ArrayList<>();
        //ArrayList <String> list7 = new List<String>();//cannot be instantiated.ArrayList cannot contain a list
    }
}
