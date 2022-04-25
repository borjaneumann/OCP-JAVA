package _6_WorkingWithGenerics;

public class _25_2_UpperBoundedWildCards {
    /*
    Upper‐Bounded Wildcards

    Let's try to write a method that adds up the total of a list of numbers.
    We've established that a generic type can't just use a subclass.
    ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE

    Instead, we need to use a wildcard.
    List<? extends Number> list = new ArrayList<Integer>();
    The upper‐bounded wildcard says that any class that extends Number or
    Number itself can be used as the formal parameter type:
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
        count += number.longValue();
        return count;
    }

    Remember how we kept saying that type erasure makes Java think that a
    generic type is an Object? That is still happening here. Java converts the
    previous code to something equivalent to the following:
    public static long total(List list) {
        long count = 0;
        for (Object obj: list) {
        Number number = (Number) obj;
        count += number.longValue();
        }
        return count;
    }

    Something interesting happens when we work with upper bounds or
    unbounded wildcards. The list becomes logically immutable and therefore
    cannot be modified. Technically, you can remove elements from the list,
    but the exam won't ask about this.
    2: static class Sparrow extends Bird { }
    3: static class Bird { }
    4:
    5: public static void main(String[] args) {
    6:      List<? extends Bird> birds = new ArrayList<Bird>();
    7:      birds.add(new Sparrow()); // DOES NOT COMPILE
    8:      birds.add(new Bird()); // DOES NOT COMPILE
    9: }
    The problem stems from the fact that Java doesn't know what type List<?
    extends Bird> really is. It could be List<Bird> or List<Sparrow> or
    some other generic type that hasn't even been written yet. Line 7 doesn't
    compile because we can't add a Sparrow to List<? extends Bird>, and
    line 8 doesn't compile because we can't add a Bird to List<Sparrow>.
    From Java's point of view, both scenarios are equally possible, so neither
    is allowed.
    Now let's try an example with an interface. We have an interface and two
    classes that implement it.

    interface Flyer { void fly(); }
    class HangGlider implements Flyer { public void fly() {} }
    class Goose implements Flyer { public void fly() {} }

    We also have two methods that use it. One just lists the interface, and the
    other uses an upper bound.

    private void anyFlyer(List<Flyer> flyer) {}
    private void groupOfFlyers(List<? extends Flyer> flyer) {}

    Note that we used the keyword extends rather than implements. Upper
    bounds are like anonymous classes in that they use extends regardless of
    whether we are working with a class or an interface.
    You already learned that a variable of type List<Flyer> can be passed to
    either method. A variable of type List<Goose> can be passed only to the
    one with the upper bound. This shows one of the benefits of generics.
    Random flyers don't fly together. We want our groupOfFlyers() method
    to be called only with the same type. Geese fly together but don't fly with
    hang gliders.
     */
}
