package _1_CreatingObjects._04_FollowingOrderOfInitialization;

public class _04_FollowingOrderOfInitialization {
    /*
    the order in which different methods, constructors, or blocks are called when an instance of
    the class is created.

    * Fields and instance initializer blocks are run in the order in which they
    appear in the file.
    * The constructor runs after all fields and instance initializer blocks have
    run.

    1: public class Chick {
    2:      private String name = "Fluffy";
    3:      { System.out.println("setting field"); }
    4:      public Chick() {
    5:          name = "Tiny";
    6:          System.out.println("setting constructor");
    7:      }
    8:      public static void main(String[] args) {
    9:          Chick chick = new Chick();
    10:         System.out.println(chick.name); } }

    Let’s look at what’s happening here. We start with the main() method
    because that’s where Java starts execution. On line 9, we call the
    constructor of Chick. Java creates a new object. First it initializes name to
    "Fluffy" on line 2. Next it executes the println() statement in the
    instance initializer on line 3. Once all the fields and instance initializers
    have run, Java returns to the constructor. Line 5 changes the value of name
    to "Tiny", and line 6 prints another statement. At this point, the
    constructor is done, and then the execution goes back to the println()
    statement on line 10.

    Order matters for the fields and blocks of code. You can’t refer to a
    variable before it has been defined:
    { System.out.println(name); } // DOES NOT COMPILE
    private String name = "Fluffy";


     */
}
