package _04_InheritingMembers;

public class _17_HidingVariables {
    /*
    Java doesn’t allow variables to be overridden. Variables can be hidden, though.

    A hidden variable occurs when a child class defines a variable with the
    same name as an inherited variable defined in the parent class. This
    creates two distinct copies of the variable within an instance of the child
    class: one instance defined in the parent class and one defined in the child
    class.

    class Carnivore {
        protected boolean hasFur = false;
    }
    public class Meerkat extends Carnivore {
        protected boolean hasFur = true;

        public static void main(String[] args) {
            Meerkat m = new Meerkat();
            Carnivore c = m;
            System.out.println(m.hasFur); // true
            System.out.println(c.hasFur); // false
        }
    }
    For now, you just need to know that overriding a method replaces the parent
    method on all reference variables (other than super), whereas hiding a
    method or variable replaces the member only if a child reference type is used.
     */
}
