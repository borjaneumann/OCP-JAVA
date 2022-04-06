package _04_CallingMethodsThatThrowExceptions;

public class _22_3_SubclassOverridesLessExceptionsExample extends Exception{
    class Hopper {
        public void hop () throws _22_3_SubclassOverridesLessExceptionsExample {}
    }
    class Bunny extends Hopper {
        public void hop() {}
    }
}
