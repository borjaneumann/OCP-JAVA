package _4_WorkingWithGenerics;

import java.util.ArrayList;
import java.util.List;

public class _1_IntroGenerics {
    static void printNames(List list) {
        for (int i = 0; i <list.size() ; i++) {
            String name = (String) list.get(i); //Class Exception
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
//        List names = new ArrayList();
//        names.add(new StringBuilder("Webby"));
//        printNames(names); // names is casted as String but we are using StringBuilder --> Class exception

        //Now with Generics
        List<String> names = new ArrayList<String>();
        names.add(new StringBuffer("Webby")); //Does not compile now only Strings are allowed
    }
}
