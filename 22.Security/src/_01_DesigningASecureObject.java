import java.util.Map;

public class _01_DesigningASecureObject {

    /*
    Java provides us with many tools to protect the objects that we create. In
    this section, we will look at access control, extensibility, validation, and
    creating immutable objects. All of these techniques can protect your
    objects
     */
    /*
    LIMITING ACCESSIBILITY
    ======================
    package animals.security;
    public class ComboLocks {
        public Map<String, String> combos;
    }

    This is terrible because the combos object has public access. This is also
    poor encapsulation. A key security principle is to limit access as much as
    possible. Think of it as “need to know” for objects.
    This is called the principle of least privilege.

    It would be better to make the combos object
    private and write a method to provide the necessary functionality.

     package animals.security;
    */
    public class ComboLocks {
        private Map<String, String> combos;

        public boolean isComboValid(String animal, String combo) {
            var correctCombo = combos.get(animal);
            return combo.equals(correctCombo);
        }
    }
    /*
    This is far better; we don't expose the combinations map to any classes
    outside the ComboLocks class. For example, package‐private is better than
    public, and private is better than package‐private.

    If your application is using modules, you can do even better by only exporting
    the security packages to the specific modules that should have access. Here's an example:

    exports animals.security to zoo.staff;

    In this example, only the zoo.staff module can access the public classes in the animals.security package.
     */


    /*
    RESTRICTING EXTENSIBILITY
    =========================
    Marking a sensitive class as final.
    Suppose you are working on a class that uses ComboLocks.
    */
    public static class GrasshopperCage {
        public static void openLock(ComboLocks comboLocks, String
                combo) {
            if (comboLocks.isComboValid("grasshopper", combo))
                System.out.println("Open!");
        }
    }
    /*
    Ideally, the first variable passed to this method is an instance of the
    ComboLocks class. However, Hacker Harry is hard at work and has created
    this subclass of ComboLocks.
    */
    public class EvilComboLocks extends ComboLocks {
        public boolean isComboValid(String animal, String combo) {
            var valid = super.isComboValid(animal, combo);
            if (valid) {
                // email the password to Hacker Harry
            }
            return valid;
        }
    }
    /*
    Marking a sensitive class as final prevents any subclasses.

     */

    public final class ComboLocksWithFinal {
        private Map<String, String> combos;
        // instantiate combos object
        public boolean isComboValid(String animal, String combo) {
            var correctCombo = combos.get(animal);
            return combo.equals(correctCombo);
        }
    }
    /*
    Hacker Harry can't create his evil class, and users of the GrasshopperCage have the assurance
    that only the expected ComboLocks class can make an appearance.
     */

    /*
    CREATING IMMUTABLE OBJECTS
    ==========================
    An immutable object is one that cannot change state after it is created.
    Immutable objects are helpful when writing secure code because you don't
    have to worry about the values changing. They also simplify code when
    dealing with concurrency.

    We worked with some immutable objects in the book. The String class
    used throughout the book is immutable. In Chapter 14, “Generics and
    Collections,” you used List.of(), Set.of(), and Map.of(). All three of
    these methods return immutable types.

    Although there are a variety of techniques for writing an immutable class,
    you should be familiar with a common strategy for making a class
    immutable.

    1. Mark the class as final. Prevents anyone from creating a mutable subclass.
    2. Mark all the instance variables private. Provides good encapsulation.
    3. Don't define any setter methods and make fields final. Ensures that callers and
    the class itself don't make changes to the instance variables.
    4. Don't allow referenced mutable objects to be modified. you shouldn't expose a getter
    method for a mutable object.
    5. Use a constructor to set all properties of the object, making a copy if needed.


     */


}
