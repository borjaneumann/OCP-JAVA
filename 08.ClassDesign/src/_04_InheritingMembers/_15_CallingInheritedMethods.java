package _04_InheritingMembers;

public class _15_InheritingMembersIntro {
    /*
    To reference a member in a parent class, you can just call it directly, as in
    the following example with the output function displaySharkDetails():
    class Fish {
        protected int size;
        private int age;
        public Fish(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }
    public class Shark extends Fish {
        private int numberOfFins = 8;
        public Shark(int age) {
            super(age);
            this.size = 4;
        }
        public void displaySharkDetails() {
            System.out.print("Shark with age: "+getAge());
            System.out.print(" and "+size+" meters long");
            System.out.print(" with "+numberOfFins+" fins");
        }
    }
    In the child class, we use the public method getAge() and protected
    member size to access values in the parent class. Remember, you can use
    this to access visible members of the current or a parent class, and you
    can use super to access visible members of a parent class.
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }
    In this example, getAge() and size can be accessed with this or super
    since they are defined in the parent class, while numberOfFins can only be
    accessed with this and not super since it is not an inherited property.
     */
}
