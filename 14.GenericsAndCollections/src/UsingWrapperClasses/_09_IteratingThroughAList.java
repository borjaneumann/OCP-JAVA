package UsingWrapperClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _09_IteratingThroughAList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (String string: list) {
            System.out.println(string);
        }

        //There is another approach.
        //The hasNext() method checks whether there is a next value. In other
        //words, it tells you whether next() will execute without throwing an
        //exception.
        // The next() method actually moves the Iterator to the next element.

        Iterator<String> iter = list.iterator();
        while  (iter.hasNext()){
            String string = iter.next();
            System.out.println(string);
        }
    }
}
