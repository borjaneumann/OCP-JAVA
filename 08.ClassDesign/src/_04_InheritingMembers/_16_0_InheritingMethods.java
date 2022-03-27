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
    in the parent class.
    2. The method in the child class must be at least as accessible as the method
    in the parent class.
    3. The method in the child class may not declare a checked exception that is
    new or broader than the class of any exception declared in the parent class
    method.
    4. If the method returns a value, it must be the same or a subtype of the
    method in the parent class, known as covariant return types.

     Defining Subtype and Supertype
     ==============================
     A
subtype is the relationship between two types where one type
inherits the other. I
     */

}
