package _4_WorkingWithGenerics._2_GenericClasses;

public class TypeErasure {
    public class Crate<T> {
        private T contents;
        public T emptyCrate() {
            return contents;
        }
        public void packCrate(T contents) {
            this.contents = contents;
        }
    }
    /*Behind the scenes, the compiler replaces all references to T in Crate
    with Object. In other words, after the code compiles, your generics
    are actually just Object types. The Crate class looks like the
    following at runtime:*/
    /*This means there is only one class file. There aren't different copies
    for different parameterized types. (Some other languages work that way.)
    This process of removing the generics syntax from your code is
    referred to as type erasure. Type erasure allows your code to be
    compatible with older versions of Java that do not contain generics.*/

    public class CrateCompiledTypeErasure {
        private Object contents;
        public Object emptyCrate() {
            return contents;
        }
        public void packCrate(Object contents) {
            this.contents = contents;
        }

        // Robot r = crate.emptyCrate();
        // q
        // The compiler turns it into following:
        // Robot r = (Robot) crate.emptyCrate();
    }
}
