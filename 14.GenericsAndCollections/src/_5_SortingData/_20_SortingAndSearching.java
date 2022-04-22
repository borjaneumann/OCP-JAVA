package _5_SortingData;

public class _20_SortingAndSearching {
    /*
    Now that you've learned all about Comparable and Comparator, we can
    finally do something useful with it, like sorting. The Collections.sort()
    method uses the compareTo() method to sort. It expects the objects to be
    sorted to be Comparable.

    2: public class SortRabbits {
    3:      static class Rabbit{ int id; }
    4:      public static void main(String[] args) {
    5:      List<Rabbit> rabbits = new ArrayList<>();
    6:      rabbits.add(new Rabbit());
    7:      Collections.sort(rabbits); // DOES NOT COMPILE
    8: } }

    Java knows that the Rabbit class is not Comparable. It knows sorting will
    fail, so it doesn't even let the code compile. You can fix this by passing a
    Comparator to sort(). Remember that a Comparator is useful when you
    want to specify sort order without using a compareTo() method.

    2: public class SortRabbits {
    3:      static class Rabbit{ int id; }
    4:      public static void main(String[] args) {
    5:      List<Rabbit> rabbits = new ArrayList<>();
    6:      rabbits.add(new Rabbit());
    7:      Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
    8:      Collections.sort(rabbits, c);
    9: } }

    The sort() and binarySearch() methods allow you to pass in a
    Comparator object when you don't want to use the natural order.

    REVIEWING BINARYSEARCH()
    The binarySearch() method requires a sorted List.

    11: List<Integer> list = Arrays.asList(6,9,1,8);
    12: Collections.sort(list); // [1, 6, 8, 9]
    13: System.out.println(Collections.binarySearch(list, 6)); // 1
    14: System.out.println(Collections.binarySearch(list, 3)); // -2

    Line 12 sorts the List so we can call binary search properly. Line 13
    prints the index at which a match is found. Line 14 prints one less than the
    negated index of where the requested value would need to be inserted. The
    number 3 would need to be inserted at index 1 (after the number 1 but
    before the number 6). Negating that gives us −1, and subtracting 1 gives
    us −2.

    There is a trick in working with binarySearch(). What do you think the
    following outputs?

    3: var names = Arrays.asList("Fluffy", "Hoppy");
    4: Comparator<String> c = Comparator.reverseOrder();
    5: var index = Collections.binarySearch(names, "Hoppy", c);
    6: System.out.println(index);

    The correct answer is ‐1. Before you panic, you don't need to know that
    the answer is ‐1. You do need to know that the answer is not defined. Line
    3 creates a list, [Fluffy, Hoppy]. This list happens to be sorted in
    ascending order. Line 4 creates a Comparator that reverses the natural
    order. Line 5 requests a binary search in descending order. Since the list is
    in ascending order, we don't meet the precondition for doing a search.
    Earlier in the chapter, we talked about collections that require classes to
    implement Comparable. Unlike sorting, they don't check that you have
    actually implemented Comparable at compile time.
    Going back to our Rabbit that does not implement Comparable, we try to
    add it to a TreeSet.

    2: public class UseTreeSet {
    3: static class Rabbit{ int id; }
    4:      public static void main(String[] args) {
    5:          Set<Duck> ducks = new TreeSet<>();
    6:          ducks.add(new Duck("Puddles"));
    7:
    8:          Set<Rabbit> rabbits = new TreeSet<>();
    9:          rabbits.add(new Rabbit()); // ClassCastException
    10: } }
    Line 6 is fine. Duck does implement Comparable. TreeSet is able to sort it
    into the proper position in the set. Line 9 is a problem. When TreeSet tries
    to sort it, Java discovers the fact that Rabbit does not implement
    Comparable. Java throws an exception that looks like this:
    Exception in thread "main" java.lang.ClassCastException:
    class Duck cannot be cast to class java.lang.Comparable
    It may seem weird for this exception to be thrown when the first object is
    added to the set. After all, there is nothing to compare yet. Java works this
    way for consistency.

    Just like searching and sorting, you can tell collections that require sorting
    that you want to use a specific Comparator, for example:

    8: Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id-r2.id);
    9: rabbits.add(new Rabbit());

    Now Java knows that you want to sort by id and all is well. Comparators
    are helpful objects. They let you separate sort order from the object to be
    sorted. Notice that line 9 in both of the previous examples is the same. It's
    the declaration of the TreeSet that has changed.
     */
}
