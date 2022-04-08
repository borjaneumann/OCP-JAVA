package _01_ApplyingTheFinalModifier;

public class _03_WritingFinalMethods {
    /*
    Methods marked final cannot be overridden by a subclass. This
    essentially prevents any polymorphic behavior on the method call and
    ensures that a specific version of the method is always called.

    Remember that methods can be assigned an abstract or final modifier.
    An abstract method is one that does not define a method body and can
    appear only inside an abstract class or interface. A final method is one
    that cannot be overridden by a subclass.
     */
    public abstract class Animal {
        abstract void chew();
    }
    public class Hippo extends Animal {
        final void chew(){} // when we declare it final cannot be overriden.
    }
    public class PygmyHippo extends Hippo {
//        void chew() {} // Does not compile
    }
    abstract class ZooKeeper {
//        public abstract final void openZoo(); //abstract and final dont get along...
    }
}
