package _03_CreatingNestedClasses;

public class _09_DeclaringAnInnerClass {
    /*
    An inner class, also called a member inner class, is a non‐ static type
    defined at the member level of a class (the same level as the methods,
    instance variables, and constructors). Inner classes have the following
    properties:
    1) Can be declared public, protected, package‐private (default), or private
    2) Can extend any class and implement interfaces
    3) Can be marked abstract or final
    4) Cannot declare static fields or methods, except for static final fields
    5) Can access members of the outer class including private members. This is a nice one!

    1: public class Outer {
    2:      private String greeting = "Hi";
    3:
    4:      protected class Inner {
    5:          public int repeat = 3;
    6:          public void go() {
    7:              for (int i = 0; i < repeat; i++)
    8:              System.out.println(greeting);
    9:              }
    10:     }
    11:
    12:     public void callInner() {
    13:         Inner inner = new Inner();
    14:         inner.go();
    15:     }
    16:     public static void main(String[] args) {
    17:         Outer outer = new Outer();
    18:         outer.callInner();
    19:     } }

    An inner class declaration looks just like a stand‐alone class declaration
    except that it happens to be located inside another class.
    Even though the variable is private, it is within that same class.
    Since an inner class is not static, it has to be used with an instance of the
    outer class. Both Inner and callInner() are members of Outer.
    Since they are peers, they just write the name.
    There is another way to instantiate Inner that looks odd at first.

    20: public static void main(String[] args) {
    21:     Outer outer = new Outer();
    22:     Inner inner = outer.new Inner(); // create the inner class
    23:     inner.go();
    24: }

    Let's take a closer look at line 22. We need an instance of Outer to create
    Inner. We can't just call new Inner() because Java won't know with
    which instance of Outer it is associated. Java solves this by calling new as
    if it were a method on the outer variable.

    Compiling the Outer.java class with which we have been working
    creates two class files. Outer.class you should be expecting. For
    the inner class, the compiler creates Outer$Inner.class. You don't
    need to know this syntax for the exam.

    Inner classes can have the same variable names as outer classes, making
    scope a little tricky. There is a special way of calling this to say which
    variable you want to access. This is something you might see on the exam
    but ideally not in the real world.
    In fact, you aren't limited to just one inner class. Please never do this in
    code you write. Here is how to nest multiple classes and access a variable
    with the same name in each:
    1: public class A {
    2:      private int x = 10;
    3:      class B {
    4:          private int x = 20;
    5:          class C {
    6:              private int x = 30;
    7:              public void allTheX() {
    8:                  System.out.println(x); // 30
    9:                  System.out.println(this.x); // 30
    10:                 System.out.println(B.this.x); // 20
    11:                 System.out.println(A.this.x); // 10
    12:     } } }
    13:     public static void main(String[] args) {
    14:         A a = new A();
    15:         A.B b = a.new B();
    16:         A.B.C c = b.new C();
    17:         c.allTheX(); // All that has to be done to call the method in the class C
    18: }}

    INNER CLASSES REQUIRE AN INSTANCE
    Take a look at the following and see whether you can figure out why
    two of the three constructor calls do not compile:
    public class Fox {
        private class Den {}
        public void goHome() {
            new Den();
    }
    public static void visitFriend() {
        new Den(); // DOES NOT COMPILE
        }
    }
    public class Squirrel {
        public void visitFox() {
            new Den(); // DOES NOT COMPILE
        }
    }
    The first constructor call compiles because goHome() is an instance
    method, and therefore the call is associated with the this instance.
    The second call does not compile because it is called inside a static
    method. You can still call the constructor, but you have to explicitly
    give it a reference to a Fox instance.
    The last constructor call does not compile for two reasons. Even
    though it is an instance method, it is not an instance method inside
    the Fox class. Adding a Fox reference would not fix the problem
    entirely, though. Den is private and not accessible in the Squirrel
    class.
     */
}
