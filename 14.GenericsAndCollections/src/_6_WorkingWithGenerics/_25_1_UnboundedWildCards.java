package _6_WorkingWithGenerics;

public class _25_1_UnboundedWildCards {
    /*
    An unbounded wildcard represents any data type. You use ? when you
    want to specify that any type is okay with you. Let's suppose that we want
    to write a method that looks through a list of any type.

    public static void printList(List<Object> list) {
        for (Object x: list)
        System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords); // DOES NOT COMPILE
    }

    Wait. What's wrong? A String is a subclass of an Object. This is true.
    However, List<String> cannot be assigned to List<Object>. We know,
    it doesn't sound logical. Java is trying to protect us from ourselves with
    this one. Imagine if we could write code like this:

    4: List<Integer> numbers = new ArrayList<>();
    5: numbers.add(new Integer(42));
    6: List<Object> objects = numbers; // DOES NOT COMPILE
    7: objects.add("forty two");
    8: System.out.println(numbers.get(1));

    On line 4, the compiler promises us that only Integer objects will appear
    in numbers. If line 6 were to have compiled, line 7 would break that
    promise by putting a String in there since numbers and objects are
    references to the same object. Good thing that the compiler prevents this.
    Going back to printing a list, we cannot assign a List<String> to a
    List<Object>. That's fine; we don't really need a List<Object>. What we
    really need is a List of “whatever.” That's what List<?> is. The following
    code does what we expect:

    public static void printList(List<?> list) {
        for (Object x: list)
        System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }

    The printList() method takes any type of list as a parameter. The
    keywords variable is of type List<String>. We have a match!
    List<String> is a list of anything. “Anything” just happens to be a
    String here.
    Finally, let's look at the impact of var. Do you think these two statements
    are equivalent?

    List<?> x1 = new ArrayList<>();
    var x2 = new ArrayList<>();
    They are not. There are two key differences. First, x1 is of type List,
    while x2 is of type ArrayList. Additionally, we can only assign x2 to a
    List<Object>. These two variables do have one thing in common. Both
    return type Object when calling the get() method.



    By now, you might have noticed that generics don't seem particularly
    useful since they are treated as an Object and therefore don't have many
    methods available. Bounded wildcards solve this by restricting what types
    can be used in a wildcard. A bounded parameter type is a generic type that
    specifies a bound for the generic. Be warned that this is the hardest section
    in the chapter, so don't feel bad if you have to read it more than once.
    A wildcard generic type is an unknown generic type represented with a
    question mark ( ?). You can use generic wildcards in three ways, as shown
    in Table 14.14. This section looks at each of these three wildcard types.

    TABLE 14.14 Types of bounds
    Type of bound                   Syntax          Example
    ==========================================================================================================
    Unbounded   wildcard            ?               List<?> a = new ArrayList<String>();
    Wildcard with an upper bound    ? extends type  List<? extends Exception> a = new ArrayList<RuntimeException>();
    Wildcard with a lower bound     ? super type    List<? super Exception> a = new ArrayList<Object>();


    Upper‐Bounded Wildcards
    Let's try to write a method that adds up the total of a list of numbers.
    We've established that a generic type can't just use a subclass.
    ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT
    COMPILE
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
    6: List<? extends Bird> birds = new ArrayList<Bird>();
    7: birds.add(new Sparrow()); // DOES NOT COMPILE
    8: birds.add(new Bird()); // DOES NOT COMPILE
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
    Lower‐Bounded Wildcards
    Let's try to write a method that adds a string “quack” to two lists.
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
    The problem is that we want to pass a List<String> and a List<Object>
    to the same method. First, make sure that you understand why the first
    three examples in Table 14.15 do not solve this problem.
     */
}
