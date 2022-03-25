package _02_CreatingClasses;

public class _07_CallingTheSuperReference {
    /*
    In Java, a variable or method can be defined in both a parent class and a
    child class. When this happens, how do we reference the version in the
    parent class instead of the current class?

    To achieve this, you can use the super reference or keyword. The super
    reference is similar to the this reference, except that it excludes any
    members found in the current class. In other words, the member must be
    accessible via inheritance.

    class Mammal {
        String type = "mammal";
    }
    public class Bat extends Mammal {
        String type = "bat";
        public String getType() {
            return super.type + ":" + this.type;
        }
        public static void main(String... zoo) {
            System.out.print(new Bat().getType()); //mammal:bat
        }
    }

    if the super reference was dropped? The program would then print bat:bat.
    Java uses the narrowest scope it can—in this case, the type variable
    defined in the Bat class. Note that the this reference in the previous
    example was optional, with the program printing the same output as it
    would if this was dropped.

    Since this includes inherited members, you often only use super when
    you have a naming conflict via inheritance. For example, you have a
    method or variable defined in the current class that matches a method or
    variable in a parent class.

     */



}
