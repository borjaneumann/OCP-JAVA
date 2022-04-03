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


     */
}
