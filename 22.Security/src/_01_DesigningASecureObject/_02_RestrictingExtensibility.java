package _01_DesigningASecureObject;

import java.util.Map;

public class _02_RestrictingExtensibility {
    /*
    Suppose you are working on a class that uses ComboLocks.
     */
    public class GrasshopperCage {
        public  void openLock(_01_LimitingAccessibility.ComboLocks comboLocks, String
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
//    public class EvilComboLocks extends ComboLocks {
//        public boolean isComboValid(String animal, String combo) {
//            var valid = super.isComboValid(animal, combo);
//            if (valid) {
//                // email the password to Hacker Harry
//            }
//            return valid;
//        }
//    }
    /*
    This is great. Hacker Harry can check whether the password is valid and
    email himself all the valid passwords. Mayhem ensues! Luckily, there is
    an easy way to prevent this problem. Marking a sensitive class as final
    prevents any subclasses.
     */
    public final class ComboLocks {
        private Map<String, String> combos;
        // instantiate combos object
        public boolean isComboValid(String animal, String combo) {
            var correctCombo = combos.get(animal);
            return combo.equals(correctCombo);
        }
    }
    /*
    Hacker Harry can't create his evil class, and users of the GrasshopperCage
    have the assurance that only the expected ComboLocks class can make an
    appearance.
     */
}
