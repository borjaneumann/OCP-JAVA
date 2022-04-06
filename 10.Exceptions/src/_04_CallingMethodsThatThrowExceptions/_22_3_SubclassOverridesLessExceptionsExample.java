package _04_CallingMethodsThatThrowExceptions;

public class SubclassOverridesLessExceptions extends Exception{
    class Hopper {
        public void hop () throws SubclassOverridesLessExceptions{}
    }
    class Bunny extends Hopper {
        public void hop() {}
    }
}
