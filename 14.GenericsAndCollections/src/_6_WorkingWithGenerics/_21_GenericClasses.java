package _6_WorkingWithGenerics;

public class _21_GenericClasses {
    /*
    You can introduce generics into your own classes. The syntax for
    introducing a generic is to declare a formal type parameter in angle
    brackets. For example, the following class named Crate has a generic type
    variable declared after the name of the class.

    public class Crate<T> {
        private T contents;
        public T emptyCrate() {
            return contents;
    }
    public void packCrate(T contents) {
            this.contents = contents;
        }
    }
    The generic type T is available anywhere within the Crate class. When
    you instantiate the class, you tell the compiler what T should be for that
    particular instance.

    NAMING CONVENTIONS FOR GENERICS
    A type parameter can be named anything you want. The convention
    is to use single uppercase letters to make it obvious that they aren't
    real class names. The following are common letters to use:

    E for an element
    K for a map key
    V for a map value
    N for a number
    T for a generic data type
    S, U, V, and so forth for multiple generic types

    For example, suppose an Elephant class exists, and we are moving our
    elephant to a new and larger enclosure in our zoo. (The San Diego Zoo did
    this in 2009. It was interesting seeing the large metal crate.)

    Elephant elephant = new Elephant();
    Crate<Elephant> crateForElephant = new Crate<>();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.emptyCrate();

    To be fair, we didn't pack the crate so much as the elephant walked into it.
    However, you can see that the Crate class is able to deal with an Elephant
    without knowing anything about it.
    This probably doesn't seem particularly impressive yet. We could have
    just typed in Elephant instead of T when coding Crate. What if we
    wanted to create a Crate for another animal?
    Crate<Zebra> crateForZebra = new Crate<>();
    Now we couldn't have simply hard‐coded Elephant in the Crate class
    since a Zebra is not an Elephant. However, we could have created an
    Animal superclass or interface and used that in Crate.
    Generic classes become useful when the classes used as the type
    parameter can have absolutely nothing to do with each other. For example,
    we need to ship our 120‐pound robot to another city.

    Robot joeBot = new Robot();
    Crate<Robot> robotCrate = new Crate<>();
    robotCrate.packCrate(joeBot);
    // ship to St. Louis
    Robot atDestination = robotCrate.emptyCrate();

    Now it is starting to get interesting. The Crate class works with any type
    of class. Before generics, we would have needed Crate to use the Object
    class for its instance variable, which would have put the burden on the
    caller of needing to cast the object it receives on emptying the crate.
    In addition to Crate not needing to know about the objects that go into it,
    those objects don't need to know about Crate either. We aren't requiring
    the objects to implement an interface named Crateable or the like. A class
    can be put in the Crate without any changes at all.
    Don't worry if you can't think of a use for generic classes of your own.
    Unless you are writing a library for others to reuse, generics hardly show
    up in the class definitions you write. They do show up frequently in the
    code you call, such as the Java Collections Framework.
    Generic classes aren't limited to having a single type parameter. This class
    shows two generic parameters.

    public class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;
    public SizeLimitedCrate(T contents, U sizeLimit) {
    this.contents = contents;
    this.sizeLimit = sizeLimit;
    } }

    T represents the type that we are putting in the crate. U represents the unit
    that we are using to measure the maximum size for the crate. To use this
    generic class, we can write the following:

    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant, Integer> c1
    = new SizeLimiteCrate<>(elephant, numPounds);

    Here we specify that the type is Elephant, and the unit is Integer. We
    also throw in a reminder that numeric literals can contain underscores.

    WHAT IS TYPE ERASURE?
    =====================
    Specifying a generic type allows the compiler to enforce proper use
    of the generic type. For example, specifying the generic type of
    Crate as Robot is like replacing the T in the Crate class with Robot.
    However, this is just for compile time.
    Behind the scenes, the compiler replaces all references to T in Crate
    with Object. In other words, after the code compiles, your generics
    are actually just Object types. The Crate class looks like the
    following at runtime:

    public class Crate {
        private Object contents;
        public Object emptyCrate() {
            return contents;
    }
    public void packCrate(Object contents) {
        this.contents = contents;
        }
    }
    This means there is only one class file. There aren't different copies
    for different parameterized types. (Some other languages work that
    way.)

    This process of removing the generics syntax from your code is
    referred to as type erasure. Type erasure allows your code to be
    compatible with older versions of Java that do not contain generics.
    The compiler adds the relevant casts for your code to work with this
    type of erased class. For example, you type the following:

    Robot r = crate.emptyCrate();
    The compiler turns it into the following:
    Robot r = (Robot) crate.emptyCrate();

     */
}
