package DeclaringAndOverridingMethodsWithExceptions;

public class PrintingAnException {
    //three ways to do it
    //1.Java does it
    //2.We do it
    //3.Print where the stack trace comes from

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
