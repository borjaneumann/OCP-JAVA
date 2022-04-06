package DeclaringAndOverridingMethodsWithExceptions;

public class NotAllowedToAddNewCheckedExceptions extends Exception{
    class Hopper {
        public void hop(){}
    }
    class Bunny extends Hopper {
//        public void hop () throws NotAllowedToAddNewCheckedExceptions {} // does not compile
    }
}
