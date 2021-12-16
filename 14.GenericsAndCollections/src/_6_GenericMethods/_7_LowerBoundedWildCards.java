package _6_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _7_LowerBoundedWildCards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

    }

}
