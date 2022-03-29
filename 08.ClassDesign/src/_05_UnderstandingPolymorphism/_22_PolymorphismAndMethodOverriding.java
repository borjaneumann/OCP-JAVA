package _05_UnderstandingPolymorphism;

public class _22_PolymorphismAndMethodOverriding {
    /*
    In Java, polymorphism states that when you override a method, you
    replace all calls to it, even those defined in the parent class. As an
    example, what do you think the following code snippet outputs?

    class Penguin {
        public int getHeight() { return 3; }
            public void printInfo() {
            System.out.print(this.getHeight());
        }
    }
    public class EmperorPenguin extends Penguin {
        public int getHeight() { return 8; } //this method replaces the parent's method.
        public static void main(String []fish) {
            new EmperorPenguin().printInfo(); // 8
        }
    }
    The facet of polymorphism that replaces methods via overriding is one of
    the most important properties in all of Java. It allows you to create
    complex inheritance models, with subclasses that have their own custom
    implementation of overridden methods. It also means the parent class does
    not need to be updated to use the custom or overridden method. If the
    method is properly overridden, then the overridden version will be used in
    all places that it is called.

    Remember, you can choose to limit polymorphic behavior by marking
    methods final, which prevents them from being overridden by a subclass.

    There is one exception to overriding a method where the parent
    method can still be called, and that is when the super reference is used.

    public class EmperorPenguin extends Penguin {
        ...
    public void printInfo() {
        System.out.print(super.getHeight()); // 3
        }
        ...
    }
     */
}
