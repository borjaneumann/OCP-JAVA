package _05_UnderstandingPolymorphism;

public class _20_CastingObjects {
    /*
    In the previous example, we created a single instance of a Lemur object
    and accessed it via superclass and interface references. Once we changed
    the reference type, though, we lost access to more specific members
    defined in the subclass that still exist within the object. We can reclaim
    those references by casting the object back to the specific subclass it came
    from:

    Primate primate = new Lemur(); // Implicit Cast -> Since Lemur is
                                    a subclass of Primate, this can be
                                    done without a cast operator.
    Lemur lemur2 = primate; // DOES NOT COMPILE
    System.out.println(lemur2.age);
    Lemur lemur3 = (Lemur)primate; // Explicit Cast
    System.out.println(lemur3.age);

    Casting objects is similar to casting primitives, as you saw in Chapter 3,
    “Operators.” When casting objects, you do not need a cast operator if the
    current reference is a subtype of the target type. This is referred to as an
    implicit cast or type conversion. Alternatively, if the current reference is
    not a subtype of the target type, then you need to perform an explicit cast
    with a compatible type. If the underlying object is not compatible with the
    type, then a ClassCastException will be thrown at runtime.

    4 rules for the exam!
    =====================
    1. Casting a reference from a subtype to a supertype doesn’t require an
    explicit cast.
    2. Casting a reference from a supertype to a subtype requires an explicit cast.
    3. The compiler disallows casts to an unrelated class. interdces is a different issue.
    4. At runtime, an invalid cast of a reference to an unrelated type results in a
    ClassCastException being thrown.

    public class Rodent {}
    public class Capybara extends Rodent {
        public static void main(String[] args) {
            Rodent rodent = new Rodent(); // rodent is not an instance of Capybara, it is just
                                            a regular object.
            Capybara capybara = (Capybara)rodent; // ClassCastException
        }
    }
    This code creates an instance of Rodent and then tries to cast it to a
    subclass of Rodent, Capybara. Although this code will compile, it will
    throw a ClassCastException at runtime since the object being referenced
    is not an instance of the Capybara class. The thing to keep in mind in this
    example is the Rodent object created does not inherit the Capybara class in
    any way.

    When reviewing a question on the exam that involves casting and
    polymorphism, be sure to remember what the instance of the object
    actually is. Then, focus on whether the compiler will allow the object to be
    referenced with or without explicit casts.
     */
}
