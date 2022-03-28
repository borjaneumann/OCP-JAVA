package _04_InheritingMembers;

public class _16_0_InheritingMethods {
    /*
    Inheriting a class not only grants access to inherited methods in the parent
    class but also sets the stage for collisions between methods defined in both
    the parent class and the subclass. In this section, we’ll review the rules for
    method inheritance and how Java handles such scenarios.

    Overriding a Method
    ===================
    In Java, overriding a method occurs when a subclass declares a new
    implementation for an inherited method with the same signature and
    compatible return type. Remember that a method signature includes the name of
    the method and method parameters.

    public class Canine {
        public double getAverageWeight() {
            return 50;
        }
    }
    public class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20; //if syper keyword is removed, it turns into a recursive call.
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight()); // 50.0
        System.out.println(new Wolf().getAverageWeight()); // 70.0
        }
    }
    Overriding Methods rules
    ========================
    1. The method in the child class must have the same signature as the method
    in the parent class. The first rule of overriding a method is somewhat self-explanatory. If two
    methods have the same name but different signatures, the methods are
    overloaded, not overridden. Overloaded methods are considered
    independent and do not share the same polymorphic properties as
    overridden methods.
        public class Bird {
            public void fly() {
                System.out.println("Bird is flying");
            }
            public void eat(int food) {
            System.out.println("Bird is eating "+food+" units of food");
            }
        }
        public class Eagle extends Bird {
            public int fly(int height) { //overloading, different parameter list
                System.out.println("Bird is flying at "+height+" meters");
                return height;
            }
            public int eat(int food) { // DOES NOT COMPILE overriding , same name and parameter list. type
                                        must be compatible.
                System.out.println("Bird is eating "+food+" units of food");
                return food;
            }
        }

    2. The method in the child class must be at least as accessible as the method
    in the parent class.
    3. The method in the child class may not declare a checked exception that is
    new or broader than the class of any exception declared in the parent class
    method.
    4. If the method returns a value, it must be the same or a subtype of the
    method in the parent class, known as covariant return types.

     Defining Subtype and Supertype
     ==============================
     A subtype is the relationship between two types where one type
    inherits the other. If we define X to be a subtype of Y, then one of
    the following is true:
    - X and Y are classes, and X is a subclass of Y.
    - X and Y are interfaces, and X is a subinterface of Y.
    - X is a class and Y is an interface, and X implements Y (either
        directly or through an inherited class).

    Likewise, a supertype is the reciprocal relationship between two
    types where one type is the ancestor of the other. Remember,
    a subclass is a subtype, but not all subtypes are subclasses.
     */

}
