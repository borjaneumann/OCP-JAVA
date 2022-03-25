package _02_CreatingClasses;

public class _05_ApplyingClassAccessModifiers {
    /*
    You can also apply access modifiers to class definitions, since we have been adding the
    public access modifier to most classes up to now.

    In Java, a top-level class is a class that is not defined inside another class.

    An inner class is a class defined inside of another class and is the
    opposite of a top-level class. In addition to public and package-private access,
    inner classes can also have protected and private access.

    As you might recall, a Java file can have many top-level classes but at
    most one public top-level class. In fact, it may have no public class at
    all. There’s also no requirement that the single public class be the first
    class in the file. One benefit of using the package-private access is that
    you can define many classes within the same Java file. For example, the
    following definition could appear in a single Java file named
    Groundhog.java, since it contains only one public class:

    class Rodent {}
    public class Groundhog extends Rodent {}

    If we were to update the Rodent class with the public access modifier, the
    Groundhog.java file would not compile unless the Rodent class was
    moved to its own Rodent.java file.


     */
}
