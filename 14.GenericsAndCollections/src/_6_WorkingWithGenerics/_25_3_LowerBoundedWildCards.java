package _6_WorkingWithGenerics;

public class _25_3_LowerBoundedWildCards {
    /*
    Let's try to write a method that adds a string “quack” to two lists.

    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);

    The problem is that we want to pass a List<String> and a List<Object>
    to the same method. First, make sure that you understand why the first
    three examples in Table 14.15 do not solve this problem.

    Why we need a lower bound   Method          Can pass a      Can pass
    public static void          compiles        List<String>    a List<Object>
    addSound(______list)
    {list.add("quack");}
    =========================================================================
    List<?>                     No (unbounded
                                generics are    Yes             Yes
                                immutable)
    -------------------------------------------------------------------------
    List<? extends              No (upper‐
    Object>                     bounded         Yes             Yes
                                generics are
                                immutable)
    -------------------------------------------------------------------------
    List<Object>                                No (with
                                                generics, must  Yes
                                 Yes            pass exact
                                                match)
    -------------------------------------------------------------------------
    List<? super String>        Yes             Yes             Yes

    To solve this problem, we need to use a lower bound.

    public static void addSound(List<? super String> list) {
        list.add("quack");
    }

    With a lower bound, we are telling Java that the list will be a list of String
    objects or a list of some objects that are a superclass of String. Either
    way, it is safe to add a String to that list.
    Just like generic classes, you probably won't use this in your code unless
    you are writing code for others to reuse. Even then it would be rare. But
    it's on the exam, so now is the time to learn it!

    UNDERSTAND GENERIC SUPERTYPES
    When you have subclasses and superclasses, lower bounds can get
    tricky.

    3: List<? super IOException> exceptions = new ArrayList<Exception>();
    4: exceptions.add(new Exception()); // DOES NOT COMPILE
    5: exceptions.add(new IOException());
    6: exceptions.add(new FileNotFoundException());

    Line 3 references a List that could be List<IOException> or
    List<Exception> or List<Object>. Line 4 does not compile
    because we could have a List<IOException> and an Exception
    object wouldn't fit in there.
    Line 5 is fine. IOException can be added to any of those types. Line
    6 is also fine. FileNotFoundException can also be added to any of
    those three types. This is tricky because FileNotFoundException is
    a subclass of IOException, and the keyword says super. What
    happens is that Java says, “Well, FileNotFoundException also
    happens to be an IOException, so everything is fine.”
     */
}
