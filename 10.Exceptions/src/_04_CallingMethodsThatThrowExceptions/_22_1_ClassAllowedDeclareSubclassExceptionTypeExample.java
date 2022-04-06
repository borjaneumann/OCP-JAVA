package _04_CallingMethodsThatThrowExceptions;

public class ClassAllowedDeclareSubclassExceptionType extends Exception {
    class Hopper {
        public void hop() throws Exception {}
    }
    class Bunny extends Hopper {
//        public void hop() throws ClassAllowedDeclareSubclassExceptionType {}
        public void hop() throws IllegalArgumentException {} //also works
    }
}
