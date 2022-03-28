package _04_InheritingMembers;

public class _16_1_InheritingMethods {
    /*
    Overriding a Generic Method
    ===========================
    You cannot overload methods by changing the generic type due to type erasure.
    To review, only one of the two methods is allowed in a class because type erasure
    will reduce both sets of arguments to (List input).

    public class LongTailAnimal {
        protected void chew(List<Object> input) {}
        protected void chew(List<Double> input) {} // DOES NOT COMPILE
        }
    For the same reason, you also can’t overload a generic method in a parent
    class.
    public class LongTailAnimal {
        protected void chew(List<Object> input) {}
        }
    public class Anteater extends LongTailAnimal {
        protected void chew(List<Double> input) {} // DOES NOT COMPILE
    }
    Both of these examples fail to compile because of type erasure. In the
    compiled form, the generic type is dropped, and it appears as an invalid
    overloaded method.

    Generic Method Parameters
    =========================
    On the other hand, you can override a method with generic parameters, but
    you must match the signature including the generic type exactly. For
    example, this version of the Anteater class does compile because it uses
    the same generic type in the overridden method as the one defined in the
    parent class:
    public class LongTailAnimal {
        protected void chew(List<String> input) {}
    }
    public class Anteater extends LongTailAnimal {
        protected void chew(List<String> input) {}
    }
    GENERICS AND WILDCARDS
    ======================
    Java includes support for generic wildcards using the question mark
    (?) character. It even supports bounded wildcards.
    void sing1(List<?> v) {} // unbounded wildcard
    void sing2(List<? super String> v) {} // lower bounded wildcard
    void sing3(List<? extends String> v) {} // upper bounded wildcard

    Generic Return Types
    ====================
    When you’re working with overridden methods that return generics, the
    return values must be covariant. In terms of generics, this means that the
    return type of the class or interface declared in the overriding method must
    be a subtype of the class defined in the parent class. The generic parameter
    type must match its parent’s type exactly.

    public class Mammal {
        public List<CharSequence> play() { ... }
        public CharSequence sleep() { ... }
    }
    public class Monkey extends Mammal {
        public ArrayList<CharSequence> play() { ... }
    }
    public class Goat extends Mammal {
        public List<String> play() { ... } // DOES NOT COMPILE
        public String sleep() { ... }
    }
    The Monkey class compiles because ArrayList is a subtype of List.
    The sleep() method in the Goat class does compile since
    String is a subtype of CharSequence. This example shows that covariance
    applies to the return type, just not the generic parameter type.

    For the exam, it might be helpful for you to apply type erasure to
    questions involving generics to ensure that they compile properly. Once
    you’ve determined which methods are overridden and which are being
    overloaded, work backward, making sure the generic types match for
    overridden methods. And remember, generic methods cannot be
    overloaded by changing the generic parameter type only.

    Redeclaring private Methods
    ===========================
    What happens if you try to override a private method? In Java, you can’t
    override private methods since they are not inherited. Just because a
    child class doesn’t have access to the parent method doesn’t mean the
    child class can’t define its own version of the method. It just means,
    strictly speaking, that the new method is not an overridden version of the
    parent class’s method.
    Java permits you to redeclare a new method in the child class with the
    same or modified signature as the method in the parent class. This method
    in the child class is a separate and independent method, unrelated to the
    parent version’s method, so none of the rules for overriding methods is
    invoked.
     */

}
