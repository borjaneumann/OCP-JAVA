package _05_UnderstandingPolymorphism;

public class _18_UnderstandingPolymorphismIntro {
    /*
    Java supports polymorphism, the property of an object to take on many
    different forms.
    To put this more precisely, a Java object may be accessed:
    1) using a reference with the same type as the object,
    2) a reference that is a superclass of the object, or
    3) a reference that defines an interface the object implements, either directly or through a superclass.

    Furthermore, a cast is not required if the object is being reassigned to a super type or interface of
    the object.

    INTERFACE INTRO
    We’ll be discussing interfaces in detail in the next chapter. For this
    chapter, you need to know the following:
    1) An interface can define abstract methods.
    2) A class can implement any number of interfaces.
    3) A class implements an interface by overriding the inherited abstract methods.
    4) An object that implements an interface can be assigned to a reference for that interface.

    The same rules for overriding methods and polymorphism apply.

    Polymorphism example
    ====================
    public class Primate {
        public boolean hasHair() {
            return true;
        }
    }
    public interface HasTail {
        public abstract boolean isTailStriped();
    }
    public class Lemur extends Primate implements HasTail {
        public boolean isTailStriped() {
            return false;
        }
        public int age = 10;
        public static void main(String[] args) {
            Lemur lemur = new Lemur();
            System.out.println(lemur.age); // 10
            HasTail hasTail = lemur;
            System.out.println(hasTail.isTailStriped()); // false
            Primate primate = lemur;
            System.out.println(primate.hasHair()); // true
        }
    }
    The most important thing to note about this example is that only one
    object, Lemur, is created and referenced. Polymorphism enables an
    instance of Lemur to be reassigned or passed to a method using one of its
    supertypes, such as Primate or HasTail.
    Once the object has been assigned to a new reference type, only the
    methods and variables available to that reference type are callable on the
    object without an explicit cast.

    The following snippets of code will not compile:
    HasTail hasTail = lemur;
    System.out.println(hasTail.age); // DOES NOT COMPILE
    Primate primate = lemur;
    System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

    The reference hasTail has direct access only to methods
    defined with the HasTail interface; therefore, it doesn’t know the variable
    age is part of the object. Likewise, the reference primate has access only
    to methods defined in the Primate class, and it doesn’t have direct access
    to the isTailStriped() method.
     */

}
