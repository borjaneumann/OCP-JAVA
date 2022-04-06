package _03_HandlingExceptions;

public class CallingMethodsThatThrowExceptions extends Exception{
    // When you’re calling a method that throws an exception, the rules are the
    //same as within a method.

    public static class Bunny {
//        public static void main(String[] args) {
////            eatCarrot(); // does not compile
//        }
        private static void eatCarrot() throws CallingMethodsThatThrowExceptions {
            System.out.println("Happy rabbit");
        }
        //This would work
//        public static void main(String[] args) throws CallingMethodsThatThroughExceptions {
//                //declare exception
//            eatCarrot();
//            }
        //This also would work
        public static void main(String[] args) {
            try {
                eatCarrot();
            } catch (CallingMethodsThatThrowExceptions e) {
                //handle exception
                System.out.println("Sad rabbit");
            }
        }
    }

}
