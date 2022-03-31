package _03_DeclaringConstructor;

public class _11_0_CallingParentConstructorsWithSuper {
    /*
    In Java, the first statement of every constructor is either a call to another
    constructor within the class, using this(), or a call to a constructor in the
    direct parent class, using super(). If a parent constructor takes arguments,
    then the super() call also takes arguments.

    public class Animal {
        private int age;
        public Animal(int age) {
            super(); // Refers to constructor in java.lang.Object
            this.age = age;
        }
    }
    public class Zebra extends Animal {
        public Zebra(int age) {
            super(age); // Refers to constructor in Animal
        }
        public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
        }
    }
    If the parent class has more than one constructor, the child class may use
    any valid parent constructor in its definition:
    public class Animal {
        private int age;
        private String name;
        public Animal(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }
        public Animal(int age) {
            super();
            this.age = age;
            this.name = null;
        }
    }
    public class Gorilla extends Animal {
        public Gorilla(int age) {
            super(age,"Gorilla");
        }
        public Gorilla() {
            super(5);
        }
    }
    Notice that the child constructors are not required to call matching parent
    constructors. Any valid parent constructor is acceptable as long as the
    appropriate input parameters to the parent constructor are provided.

    SUPER VS. SUPER()
    Like this and this(), super and super() are unrelated in Java. The
    first, super, is used to reference members of the parent class, while
    the second, super(), calls a parent constructor. Anytime you see the
    super keyword on the exam, make sure it is being used properly.
     */

}
