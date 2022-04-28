package _01_DesigningASecureObject;

import java.util.ArrayList;

public class _04_CloningObjects {
    /*
    CLONING OBJECTS
    ===============
    Java has a Cloneable interface that you can implement if you want classes
    to be able to call the clone() method on your object. This helps with
    making defensive copies.

    Shallow copy
    */
    public static final class Animal4 {
        private final ArrayList<String> favoriteFoods;

        public Animal4(ArrayList<String> favoriteFoods) {
            if (favoriteFoods == null)
                throw new RuntimeException("Favorite food is required");
            this.favoriteFoods = (ArrayList) favoriteFoods.clone();//TThe ArrayList class does just that,
            // which means there's another way to write the statement.
        }

        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }

        public String getFavoriteFoodsElement(int index) {
            return favoriteFoods.get(index);
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> food = new ArrayList<>();
        food.add("grass");
        Animal4 sheep = new Animal4(food);
//        Animal4 clone = (Animal4) sheep.clone();
//        System.out.println(sheep == clone); //false
//        System.out.println(sheep.favoriteFoods == clone.favoriteFoods);//true
    }
    /*
    By default, the clone() method makes a shallow copy of the data, which
    means only the top‐level object references and primitives are copied. No
    new objects from within the cloned object are created. For example, if the
    object contains a reference to an ArrayList, a shallow copy contains a
    reference to that same ArrayList. Changes to the ArrayList in one object
    will be visible in the other since it is the same object.
     */

    //Deep Copy
    /*
    you can write an implementation that does a deep copy and
    clones the objects inside. A deep copy does make a new ArrayList object.
    Changes to the cloned object do not affect the original.

    public Animal clone() {
        ArrayList<String> listClone = (ArrayList)
        favoriteFoods.clone();
        return new Animal(listClone);
    }
    Now the main() method prints false twice because the ArrayList is also
    cloned.
    You might have noticed that the clone() method is declared in the Object
    class. The default implementation throws an exception that tells you the
    Object didn't implement Cloneable. If the class implements Cloneable,
    you can call clone(). Classes that implement Cloneable can also provide
    a custom implementation of clone(), which is useful when the class
    wants to make a deep copy.

    Cloneable logic
    In the last block, implementation‐dependent means you should probably
    check the Javadoc of the overridden clone() method before using it. It
    may provide a shallow copy, a deep copy, or something else entirely. For
    example, it may be a shallow copy limited to three levels.

     */
}
