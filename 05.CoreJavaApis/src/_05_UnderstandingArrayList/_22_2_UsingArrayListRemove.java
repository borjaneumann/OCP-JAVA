package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_2_UsingArrayListRemove {
    public static void main(String[] args) {
        //boolean remove (Object object)
        //E remove (int index)

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));//false
        System.out.println(birds.remove("hawk"));//true
        System.out.println(birds.remove(0));//removes hawk
        System.out.println(birds);//[]

    }



}
