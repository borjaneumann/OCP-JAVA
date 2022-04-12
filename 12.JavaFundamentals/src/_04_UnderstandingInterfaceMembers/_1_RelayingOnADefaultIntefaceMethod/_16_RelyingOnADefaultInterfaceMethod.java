package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod;

public class _16_RelyingOnADefaultInterfaceMethod {
    /*
    A default method is a method defined in an interface with the default
    keyword and includes a method body. Contrast default methods with
    abstract methods in an interface, which do not define a method body.

    A default method may be overridden by a class implementing the
    interface. The name default comes from the concept that it is viewed as an
    abstract interface method with a default implementation. The class has the
    option of overriding the default method, but if it does not, then the
    default implementation will be used.

    PURPOSE OF DEFAULT METHODS
    1) Backward compatibility
    2) Convenience. For instance, the Comparator interface includes a
    default reversed() method that returns a new Comparator in the
    order reversed.

    The following is an example of a default method defined in an interface:
    public interface IsWarmBlooded {
        boolean hasScales();
        default double getTemperature() {
            return 10.0;
        }
    }
    DEFAULT INTERFACE METHOD DEFINITION RULES
    =========================================
    1. A default method may be declared only within an interface.
    2. A default method must be marked with the default keyword and include a method body.
    3. A default method is assumed to be public.
    4. A default method cannot be marked abstract, final, or static.
    5. A default method may be overridden by a class that implements the interface.
    6. If a class inherits two or more default methods with the same method
    signature, then the class must override the method. If a class implements
    two interfaces that have default methods with the same method signature,
    the compiler will report an error.

    6. Inheriting Duplicate default Methods
    =======================================
    By allowing default methods in interfaces, coupled with the fact that a class
    may implement multiple interfaces, Java has essentially opened the door to multiple
    inheritance problems. For example, what value would the following code output?

    public interface Walk {
        public default int getSpeed() { return 5; }
    }
    public interface Run {
        public default int getSpeed() { return 10; }
    }
    public class Cat implements Walk, Run { // DOES NOT COMPILE
        public static void main(String[] args) {
            System.out.println(new Cat().getSpeed());
        }
    }
    If a class implements two interfaces that have default methods with the
    same method signature, the compiler will report an error.
    If the class implementing the interfaces overrides the duplicate default
    method, then the code will compile without issue.

    public class Cat implements Walk, Run {
        public int getSpeed() { return 1; }
        public static void main(String[] args) {
            System.out.println(new Cat().getSpeed());
        }
    }
    What if we want to call the version of the default method in
    the Walk interface?

    public class Cat implements Walk, Run {
        public int getSpeed() {
            return 1;
    }
    public int getWalkSpeed() {
        return Walk.super.getSpeed();// Answer
    }
    public static void main(String[] args) {
            System.out.println(new Cat().getWalkSpeed());
        }
    }
    We first use the interface name, followed by the super
    keyword, followed by the default method we want to call. We also put
    the call to the inherited default method inside the instance method
    getWalkSpeed(), as super is not accessible in the main() method.

     */
}
