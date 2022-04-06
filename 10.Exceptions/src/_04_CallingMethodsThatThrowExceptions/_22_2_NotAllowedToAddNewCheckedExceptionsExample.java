package _04_CallingMethodsThatThrowExceptions;

public class _22_2_NotAllowedToAddNewCheckedExceptionsExample extends Exception{
    class Hopper {
        public void hop(){}
    }
    class Bunny extends Hopper {
//        public void hop () throws NotAllowedToAddNewCheckedExceptions {} // does not compile
    }
}
