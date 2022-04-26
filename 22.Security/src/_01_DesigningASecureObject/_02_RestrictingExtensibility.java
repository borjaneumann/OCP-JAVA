package _01_DesigningASecureObject;

public class _02_RestrictingExtensibility {

    /*
    RESTRICTING EXTENSIBILITY
    =========================
    Marking a sensitive class as final.
    Suppose you are working on a class that uses ComboLocks.
    */
    public static class GrasshopperCage {
        public static void openLock(_01_LimitingAccessibility.ComboLocks comboLocks, String
                combo) {
            if (comboLocks.isComboValid("grasshopper", combo))
                System.out.println("Open!");
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
}
