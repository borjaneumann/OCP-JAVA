package _01_DesigningASecureObject;

import java.util.ArrayList;
import java.util.List;

public class _03_CreatingImmutableObjects {
    /*
    CREATING IMMUTABLE OBJECTS
    ==========================
    An immutable object is one that cannot change state after it is created.
    Immutable objects are helpful when writing secure code because you don't
    have to worry about the values changing. They also simplify code when
    dealing with concurrency.

    We worked with some immutable objects in the book. The String class
    used throughout the book is immutable. In Chapter 14, “Generics and
    Collections,” you used List.of(), Set.of(), and Map.of(). All three of
    these methods return immutable types.

    Although there are a variety of techniques for writing an immutable class,
    you should be familiar with a common strategy for making a class
    immutable.

    1. Mark the class as final. Prevents anyone from creating a mutable subclass.
    2. Mark all the instance variables private. Provides good encapsulation.
    3. Don't define any setter methods and make fields final. Ensures that callers and
    the class itself don't make changes to the instance variables.
    4. Don't allow referenced mutable objects to be modified. you shouldn't expose a getter
    method for a mutable object.
    5. Use a constructor to set all properties of the object, making a copy if needed.

    4th Rule Case
    =============
    The fourth rule is subtler. Basically, it means you shouldn't expose a getter
    method for a mutable object. For example, can you see why the following
    is not an immutable object?
    import java.util.*;
     */


    public final class Animal {
        private final ArrayList<String> favoriteFoods;

        public Animal() {
            this.favoriteFoods = new ArrayList<String>();
            this.favoriteFoods.add("Apples");
        }

        public List<String> getFavoriteFoods() {
            return favoriteFoods;
        }
    }

    /*
    We  followed the first three rules, but unfortunately, Hacker
    Harry can modify our data by calling getFavoriteFoods().clear() or
    add a food to the list that our animal doesn't like.
    It's not an immutable object if we can change it contents!
    If we don't have a getter for the favoriteFoods object, how do callers access it?
    Simple, by using delegate methods to read the data, as shown in the following:
     */
    public final class Animal1 {
        private final ArrayList<String> favoriteFoods;

        public Animal1() {
            this.favoriteFoods = new ArrayList<String>();
            this.favoriteFoods.add("Apples");
        }

        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }

        public String getFavoriteFoodsElement(int index) {
            return favoriteFoods.get(index);
        }
    }
    //In this improved version, the data is still available. However, it is a true
    //immutable object because the mutable variable cannot be modified by the caller.

    /*
    Another option is to create a copy of the favoriteFoods object and
    return the copy anytime it is requested, so the original remains safe.

    public ArrayList<String> getFavoriteFoods() {
        return new ArrayList<String>(this.favoriteFoods);
    }

    Of course, changes in the copy won't be reflected in the original, but at
    least the original is protected from external changes.
     */

    /*
    Fifth rule.
    Let's say we want to allow the user to provide the favoriteFoods data, so we implement the following:
     */
    public final class Animal2 {
        private final ArrayList<String> favoriteFoods;

        public Animal2(ArrayList<String> favoriteFoods) {
            if (favoriteFoods == null)
                throw new RuntimeException("Favorite food is required");
            this.favoriteFoods = favoriteFoods;
        }

        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }

        public String getFavoriteFoodsElement(int index) {
            return favoriteFoods.get(index);
        }
    }

    /*
    Hacker Harry is tricky, though. He decides to send us a favoriteFood object but keep his own
    secret reference to it, which he can modify directly.
     */
    void modifyNotSoImmutableObject() {
        var favorites = new ArrayList<String>();
        favorites.add("Apples");
        var animal = new Animal2(favorites);
        System.out.print(animal.getFavoriteFoodsCount()); //1
        favorites.clear();
        System.out.print(animal.getFavoriteFoodsCount()); //0
    }

    /*
    This method prints 1, followed by 0. Whoops! It seems like Animal is not
    immutable anymore, since its contents can change after it is created.

    The solution is to use a copy constructor to make a copy of the list object
    containing the same elements.
     */
    public final class Animal3 {
        private final ArrayList<String> favoriteFoods;

        public Animal3(ArrayList<String> favoriteFoods) {
            if (favoriteFoods == null)
                throw new RuntimeException("Favorite food is required");
            this.favoriteFoods = new ArrayList<String>(favoriteFoods);//The solution is to use a
            // copy constructor to make a copy of the list object containing the same elements.
        }

        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }

        public String getFavoriteFoodsElement(int index) {
            return favoriteFoods.get(index);
        }
    }
    /*
    The copy operation is called a defensive copy because the copy is being
    made in case other code does something unexpected. With this approach,
    Hacker Harry is defeated. He can modify the original favoriteFoods all
    he wants, but it doesn't change the Animal object's contents.
     */
}
