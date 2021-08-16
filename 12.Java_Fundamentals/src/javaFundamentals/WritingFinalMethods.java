package javaFundamentals;

public class WritingFinalMethods {
    public abstract class Animal {
        abstract void chew();
    }
    public class Hippo extends Animal {
        final void chew(){} // when we declare it final cannot be overriden.
    }
    public class PygmyHippo extends Hippo {
//        void chew( {}) // Does not compile
    }
    abstract class ZooKeeper {
//        public abstract final void openZoo(); //abstract and final dont get along...
    }
}
