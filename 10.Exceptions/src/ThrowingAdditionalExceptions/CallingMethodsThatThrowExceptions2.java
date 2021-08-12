package ThrowingAdditionalExceptions;

public class CallingMethodsThatThrowExceptions2 {
    public void bad ( ){
//        try {
//            eatCarrot();
//        } catch (CallingMethodsThatThrowExceptions2 e )
        {
            //Does not compile
            System.out.println("sad rabbit");
        }
    }
//    public void good() throws CallingMethodsThatThrowExceptions2 {
//        eatCarrot();
//    }
    private void eatCarrot() {}
}
