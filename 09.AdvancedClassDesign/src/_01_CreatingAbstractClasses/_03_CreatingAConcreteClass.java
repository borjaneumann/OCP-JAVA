package _01_CreatingAbstractClasses;

public class _03_CreatingAConcreteClass {
    /*
    An abstract class becomes usable when it is extended by a concrete
    subclass. A concrete class is a nonabstract class. The first concrete
    subclass that extends an abstract class is required to implement all
    inherited abstract methods. This includes implementing any inherited
    abstract methods from inherited interfaces, as we will see later in this
    chapter.

    We highlight the first concrete subclass for a reason. An abstract class can
    extend a nonabstract class, and vice versa. Any time a concrete class is
    extending an abstract class, it must implement all of the methods that are
    inherited as abstract. In the example beloo all compiles, please explain why!

    abstract class Mammal {
        abstract void showHorn();
        abstract void eatLeaf();
    }
    abstract class Rhino extends Mammal {
        void showHorn() {}
    }
    public class BlackRhino extends Rhino {
        void eatLeaf() {}
    }

    Let’s try one more example. The following concrete class Lion inherits
    two abstract methods, getName() and roar():

    public abstract class Animal {
        abstract String getName();
    }
    public abstract class BigCat extends Animal {
        protected abstract void roar();
    }
    public class Lion extends BigCat {
        public String getName() {
        return "Lion";
        }
        public void roar() {
            System.out.println("The Lion lets out a loud ROAR!");
        }
    }

    In this sample code, BigCat extends Animal but is marked as abstract;
    therefore, it is not required to provide an implementation for the
    getName() method. The class Lion is not marked as abstract, and as the
    first concrete subclass, it must implement all of the inherited abstract
    methods not defined in a parent class. All three of these classes compile
    successfully.
     */
}
