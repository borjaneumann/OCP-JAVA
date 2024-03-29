package _02_ImplementingInterfaces;

public class _07_InheritingAnInterface {
    /*
    An interface can be inherited in one of three ways.
    1) An interface can extend another interface.
    2) A class can implement an interface.
    3) A class can extend another class whose ancestor implements an interface.

    When an interface is inherited, all of the abstract methods are inherited.
    Like we saw with abstract classes, if the type inheriting the interface is
    also abstract, such as an interface or abstract class, it is not required to
    implement the interface methods. On the other hand, the first concrete
    subclass that inherits the interface must implement all of the inherited
    abstract methods.

    public interface HasTail {
        public int getTailLength();
    }
    public interface HasWhiskers {
        public int getNumberOfWhiskers();
    }
    public abstract class HarborSeal implements HasTail,
        HasWhiskers {
    }
    public class CommonSeal extends HarborSeal { // DOES NOT COMPILE }

    The HarborSeal class is not required to implement any of the abstract
    methods it inherits from the HasTail and HasWhiskers because it is
    marked abstract. The concrete class CommonSeal, which extends
    HarborSeal, is required to implement all inherited abstract methods. In
    this example, CommonSeal doesn’t provide an implementation for the
    inherited abstract interface methods, so CommonSeal doesn’t compile.

    Mixing Class and Interface Keywords
    ===================================
    public interface CanRun {}
    public class Cheetah extends CanRun {} // DOES NOT COMPILE
    public class Hyena {}
    public interface HasFur extends Hyena {} // DOES NOT COMPILE

    The following is the only valid syntax for
    relating classes and interfaces in their declarations:
    class1 extends class2
    interface1 extends interface2, interface3, ...
    class1 implements interface2, interface3, ...

    Duplicate Interface Method Declarations
    =======================================
    Since Java allows for multiple inheritance via interfaces, you might be
    wondering what will happen if you define a class that inherits from two
    interfaces that contain the same abstract method.

    public interface Herbivore {
        public void eatPlants();
    }
    public interface Omnivore {
        public void eatPlants();
        public void eatMeat();
    }
    As they have identical method declarations, they are also
    considered compatible. By compatibility, we mean that the compiler can
    resolve the differences between the two declarations without finding any
    conflicts. You can define a class that fulfills both interfaces
    simultaneously.

    public class Bear implements Herbivore, Omnivore {
        public void eatMeat() {
            System.out.println("Eating meat");
        }
        public void eatPlants() {
            System.out.println("Eating plants");
        }
    }
    As we said earlier, interfaces simply define a set of rules that a class
    implementing them must follow. If two abstract interface methods have
    identical behaviors—or in this case the same method declaration—you
    just need to be able to create a single method that overrides both inherited
    abstract methods at the same time.
    What if the duplicate methods have different signatures? If the method
    name is the same but the input parameters are different, there is no conflict
    because this is considered a method overload.

    The the same signature but different return types?
    In that case, you need to review the rules for overriding methods.

    interface Dances {
        String swingArms();
    }
    interface EatsFish {
        CharSequence swingArms();
    }
    public class Penguin implements Dances, EatsFish {
        public String swingArms() {
            return "swing!"; //The EatsFish version of swingArms() is also overridden as String and
                            CharSequence are covariant return types.
        }
    }

    Let’s take a look at a sample where the return types are not covariant:
    interface Dances {
        int countMoves();
    }
    interface EatsFish {
        boolean countMoves();
    }
    public class Penguin implements Dances, EatsFish { // DOES NOT
        COMPILE
        ...
    }
    Since it is not possible to define a version of countMoves() that returns
    both int and boolean, there is no implementation of the Penguin that will
    allow this declaration to compile. It is the equivalent of trying to define
    two methods in the same class with the same signature and different return
    types.

    Also an issue for the compiler:

    interface LongEars {
        int softSkin();
    }
    interface LongNose {
        void softSkin();
    }
    interface Donkey extends LongEars, LongNose {} // DOES NOT COMPILE
    abstract class Aardvark implements LongEars, LongNose {} // DOES NOT COMPILE

    All of the types in this example are abstract, with none being concrete.
    Despite the fact they are all abstract, the compiler detects that Donkey and
    Aardvark contain incompatible methods and prevents them from
    compiling.








     */
}
