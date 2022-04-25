package _6_WorkingWithGenerics;

public class _26_PuttingItAllTogether {
    /*
    At this point, you know everything that you need to know to ace the exam
    questions on generics. It is possible to put these concepts together to write
    some really confusing code, which the exam likes to do.
    This section is going to be difficult to read. It contains the hardest
    questions that you could possibly be asked about generics. The exam
    questions will probably be easier to read than these. We want you to
    encounter the really tough ones here so that you are ready for the exam. In
    other words, don't panic. Take it slow, and reread the code a few times.

    Combining Generic Declarations
    ------------------------------
    Let's try an example. First, we declare three classes that the example will use.

    class A {}
    class B extends A {}
    class C extends B {}

    Ready? Can you figure out why these do or don't compile? Also, try to
    figure out what they do.

    6: List<?> list1 = new ArrayList<A>();
    7: List<? extends A> list2 = new ArrayList<A>();
    8: List<? super A> list3 = new ArrayList<A>();

    Line 6 creates an ArrayList that can hold instances of class A. It is stored
    in a variable with an unbounded wildcard. Any generic type can be
    referenced from an unbounded wildcard, making this okay.
    Line 7 tries to store a list in a variable declaration with an upper‐bounded
    wildcard. This is okay. You can have ArrayList<A>, ArrayList<B>, or
    ArrayList<C> stored in that reference. Line 8 is also okay. This time, you
    have a lower‐bounded wildcard. The lowest type you can reference is A.
    Since that is what you have, it compiles.

    Did you get those right? Let's try a few more.

    9: List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
    10: List<? super B> list5 = new ArrayList<A>();
    11: List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE

    Line 9 has an upper‐bounded wildcard that allows ArrayList<B> or
    ArrayList<C> to be referenced. Since you have ArrayList<A> that is
    trying to be referenced, the code does not compile. Line 10 has a lower‐
    bounded wildcard, which allows a reference to ArrayList<A>,
    ArrayList<B>, or ArrayList<Object>.
    Finally, line 11 allows a reference to any generic type since it is an
    unbounded wildcard. The problem is that you need to know what that type
    will be when instantiating the ArrayList. It wouldn't be useful anyway,
    because you can't add any elements to that ArrayList.
    Passing Generic Arguments
    Now on to the methods. Same question: try to figure out why they don't
    compile or what they do. We will present the methods one at a time
    because there is more to think about.
    <T> T first(List<? extends T> list) {
        return list.get(0);
    }
    The first method, first(), is a perfectly normal use of generics. It uses a
    method‐specific type parameter, T. It takes a parameter of List<T>, or
    some subclass of T, and it returns a single object of that T type. For
    example, you could call it with a List<String> parameter and have it
    return a String. Or you could call it with a List<Number> parameter and
    have it return a Number. Or . . . well, you get the idea.
    Given that, you should be able to see what is wrong with this one:

    <T> <? extends T> second(List<? extends T> list) { // DOES NOT COMPILE
    return list.get(0);
    }
    The next method, second(), does not compile because the return type isn't
    actually a type. You are writing the method. You know what type it is
    supposed to return. You don't get to specify this as a wildcard.
    Now be careful—this one is extra tricky:
    <B extends A> B third(List<B> list) {
        return new B(); // DOES NOT COMPILE
    }
    This method, third(), does not compile. <B extends A> says that you
    want to use B as a type parameter just for this method and that it needs to
    extend the A class. Coincidentally, B is also the name of a class. It isn't a
    coincidence. It's an evil trick. Within the scope of the method, B can
    represent class A, B, or C, because all extend the A class. Since B no longer
    refers to the B class in the method, you can't instantiate it.
    After that, it would be nice to get something straightforward.
    void fourth(List<? super B> list) {}
    We finally get a method, fourth(), which is a normal use of generics.
    You can pass the types List<B>, List<A>, or List<Object>.
    Finally, can you figure out why this example does not compile?

    <X> void fifth(List<X super B> list) { // DOES NOT COMPILE}

    This last method, fifth(), does not compile because it tries to mix a
    method‐specific type parameter with a wildcard. A wildcard must have a ?
    in it.
    Phew. You made it through generics. That's the hardest topic in this
    chapter (and why we covered it last!). Remember that it's okay if you need
    to go over this material a few times to get your head around it.
     */
}
