package _04_CallingMethodsThatThrowExceptions;

public class _22_1_ClassAllowedDeclareSubclassExceptionTypeExample extends Exception {
    class Hopper {
        public void hop() throws Exception {}
    }
    class Bunny extends Hopper {
//        public void hop() throws ClassAllowedDeclareSubclassExceptionType {}
        public void hop() throws IllegalArgumentException {} //also works
    }
}
