package UsingWrapperClasses;

import java.util.ArrayList;

public class NullValues {

    public static void main(String[] args) {
        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }

}
