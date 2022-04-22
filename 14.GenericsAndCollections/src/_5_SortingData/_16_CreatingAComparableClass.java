package _5_SortingData;

public class _16_CreatingAComparableClass {
    /*
    The Comparable interface has only one method. In fact, this is the entire interface:
    public interface Comparable<T> {
        int compareTo(T o);
    }
    The generic T lets you implement this method and specify the type of your
    object. This lets you avoid a cast when implementing compareTo(). Any
    object can be Comparable.

    import java.util.*;
    public class Duck implements Comparable<Duck> {
        private String name;
        public Duck(String name) {
            this.name = name;
    }
    public String toString() { // use readable output
        return name;
    }
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    }}

    Without implementing that interface, all we have is a method named
    compareTo(), but it wouldn't be a Comparable object. We could also
    implement Comparable<Object> or some other class for T, but this
    wouldn't be as useful for sorting a group of Duck objects with each other.
    The Duck class overrides the toString() method from Object,
    which we described in Chapter 12. This override provides useful
    output when printing out ducks. Without this override, the output
    would be something like [Duck@70dea4e, Duck@5c647e05]—hardly
    useful in seeing which duck's name comes first.
    Finally, the Duck class implements compareTo(). Since Duck is comparing
    objects of type String and the String class already has a compareTo()
    method, it can just delegate.
    We still need to know what the compareTo() method returns so that we
    can write our own.

    There are three rules to know.

    - The number 0 is returned when the current object is equivalent to the
    argument to compareTo().
    - A negative number (less than 0) is returned when the current object is
    smaller than the argument to compareTo().
    - A positive number (greater than 0) is returned when the current object is
    larger than the argument to compareTo().

    Let's look at an implementation of compareTo() that compares numbers
    instead of String objects.

    1: public class Animal implements Comparable<Animal> {
    2:      private int id;
    3:      public int compareTo(Animal a) {
    4:          return id – a.id; // sorts ascending by id
    5:      }
    6:      public static void main(String[] args) {
    7:          var a1 = new Animal();
    8:          var a2 = new Animal();
    9:          a1.id = 5;
    10:         a2.id = 7;
    11:         System.out.println(a1.compareTo(a2)); // -2
    12:         System.out.println(a1.compareTo(a1)); // 0
    13:         System.out.println(a2.compareTo(a1)); // 2
    14:     } }

    Lines 7 and 8 create two Animal objects. Lines 9 and 10 set their id
    values. This is not a good way to set instance variables. It would be better
    to use a constructor or setter method. Since the exam shows nontraditional
    code to make sure that you understand the rules, we throw in some non‐
    traditional code as well.
    Lines 3‐5 show one way to compare two int values. We could have used
    Integer.compare(id, a.id) instead. Be sure to be able to recognize both
    approaches.
    Remember that id ‐ a.id sorts in ascending order, and a.id ‐ id
    sorts in descending order.
    Lines 11 through 13 confirm that we've implemented compareTo()
    correctly. Line 11 compares a smaller id to a larger one, and therefore it
    prints a negative number. Line 12 compares animals with the same id, and
    therefore it prints 0. Line 13 compares a larger id to a smaller one, and
    therefore it returns a positive number.

    Casting the compareTo() Argument
    --------------------------------
    When dealing with legacy code or code that does not use generics, the
    compareTo() method requires a cast since it is passed an Object.
    public class LegacyDuck implements Comparable {
        private String name;
        public int compareTo(Object obj) {
            LegacyDuck d = (LegacyDuck) obj; // cast because no generics
            return name.compareTo(d.name);
        }
    }
    Since we don't specify a generic type for Comparable, Java assumes that
    we want an Object, which means that we have to cast to LegacyDuck
    before accessing instance variables on it.

    Checking for null
    =================
    When working with Comparable and Comparator in this chapter, we tend
    to assume the data has values, but this is not always the case. When
    writing your own compare methods, you should check the data before
    comparing it if is not validated ahead of time.

    public class MissingDuck implements Comparable<MissingDuck> {
        private String name;
        public int compareTo(MissingDuck quack) {
            if (quack == null)
            throw new IllegalArgumentException("Poorly formed
            duck!");
            if (this.name == null && quack.name == null)
            return 0;
            else if (this.name == null) return -1;
            else if (quack.name == null) return 1;
            else return name.compareTo(quack.name);
        }
    }
    This method throws an exception if it is passed a null MissingDuck
    object. What about the ordering? If the name of a duck is null, then it's
    sorted first.

    Keeping compareTo() and equals() Consistent
    ===========================================
    If you write a class that implements Comparable, you introduce new
    business logic for determining equality. The compareTo() method returns
    0 if two objects are equal, while your equals() method returns true if two
    objects are equal. A natural ordering that uses compareTo() is said to be
    consistent with equals if, and only if, x.equals(y) is true whenever
    x.compareTo(y) equals 0.
    Similarly, x.equals(y) must be false whenever x.compareTo(y) is not
    0. You are strongly encouraged to make your Comparable classes
    consistent with equals because not all collection classes behave
    predictably if the compareTo() and equals() methods are not consistent.
    For example, the following Product class defines a compareTo() method
    that is not consistent with equals:

    public class Product implements Comparable<Product> {
        private int id;
        private String name;
        public int hashCode() { return id; }
        public boolean equals(Object obj) {
            if(!(obj instanceof Product)) return false;
            var other = (Product) obj;
            return this.id == other.id;
        }
        public int compareTo(Product obj) {
            return this.name.compareTo(obj.name);
    } }
    You might be sorting Product objects by name, but names are not unique.
    Therefore, the return value of compareTo() might not be 0 when
    comparing two equal Product objects, so this compareTo() method is not
    consistent with equals. One way to fix that is to use a Comparator to
    define the sort elsewhere.
    Now that you know how to implement Comparable objects, you get to
    look at Comparators and focus on the differences
     */
}
