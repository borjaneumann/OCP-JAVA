package _04_InheritingMembers;

public class _16_2_InheritingMethods {
    /*
    Hiding Static Methods
    =====================
    A hidden method occurs when a child class defines a static method with
    the same name and signature as an inherited static method defined in a
    parent class. Method hiding is similar but not exactly the same as method
    overriding. The previous four rules for overriding a method must be
    followed when a method is hidden. In addition, a new rule is added for
    hiding a method:
    5. The method defined in the child class must be marked as static if it is
    marked as static in a parent class.
    Put simply, it is method hiding if the two methods are marked static, and
    method overriding if they are not marked static. If one is marked static
    and the other is not, the class will not compile.

    public class Bear {
        public static void eat() {
            System.out.println("Bear is eating");
        }
    }
    public class Panda extends Bear {
        public static void eat() {
            System.out.println("Panda is chewing");
        }
        public static void main(String[] args) {
            eat();
        }
    }
    In this example, the code compiles and runs. The eat() method in the
    Panda class hides the eat() method in the Bear class, printing "Panda is
    chewing" at runtime. Because they are both marked as static, this is not
    considered an overridden method. That said, there is still some inheritance
    going on. If you remove the eat() method in the Panda class, then the
    program prints "Bear is eating" at runtime.

    Creating final Methods
    ======================
    By marking a method final, you forbid a child class from replacing this
    method. This rule is in place both when you override a method and when
    you hide a method. In other words, you cannot hide a static method in a
    child class if it is marked final in the parent class.

    Why mark a method as final?
    For example, you’d mark a method as final when you’re defining a parent class and
    want to guarantee certain behavior of a method in the parent class,
    regardless of which child is invoking the method.
    The reason methods are not commonly marked as final in practice,
    though, is that it may be difficult for the author of a parent class
    method to consider all of the possible ways her child class may be
    used.
    The final modifier is often used when the author of the parent class wants to guarantee
    certain behavior at the cost of limiting polymorphism.
     */

}
