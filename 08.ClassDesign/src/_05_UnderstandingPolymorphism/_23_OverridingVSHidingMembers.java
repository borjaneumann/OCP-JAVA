package _05_UnderstandingPolymorphism;

public class _23_OverridingVSHidingMembers {
    /*
    While method overriding replaces the method everywhere it is called,
    static method and variable hiding does not. Strictly speaking, hiding
    members is not a form of polymorphism since the methods and variables
    maintain their individual properties. Unlike method overriding, hiding
    members is very sensitive to the reference type and location where the
    member is being used. Let’s take a look at an example:

    class Penguin {
        public static int getHeight() { return 3; } //it is hidden, not overridden
        public void printInfo() {
            System.out.println(this.getHeight()); //"this" works but not recommended.
        }
    }
    public class CrestedPenguin extends Penguin {
        public static int getHeight() { return 8; }
        public static void main(String... fish) {
            new CrestedPenguin().printInfo(); // 3
        }
    }

    The result is that calling getHeight() in
    CrestedPenguin returns a different value than calling it in the Penguin,
    even if the underlying object is the same.

    Besides the location, the reference type can also determine the value you
    get when you are working with hidden members. Ready? Let’s try a more
    complex example:

    class Marsupial {
        protected int age = 2;
        public static boolean isBiped() {
            return false;
        }
    }
    public class Kangaroo extends Marsupial {
        protected int age = 6;
        public static boolean isBiped() {
            return true;
        }
        public static void main(String[] args) {
            Kangaroo joey = new Kangaroo();
            Marsupial moey = joey;
            System.out.println(joey.isBiped()); //true
            System.out.println(moey.isBiped()); // false
            System.out.println(joey.age); // 6
            System.out.println(moey.age); // 2
        }
    }
    Remember only one object, of type Kangaroo, is created
    and stored in memory. Since static methods can only be hidden, not
    overridden, Java uses the reference type to determine which version of
    isBiped() should be called, resulting in joey.isBiped() printing true
    and moey.isBiped() printing false.
     */

}
