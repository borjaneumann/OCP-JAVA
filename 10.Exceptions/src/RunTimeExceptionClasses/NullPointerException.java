package RunTimeExceptionClasses;

public class NullPointerException {
    //Instance variables and methods must be called on a non-null reference
    String name;
    public void printLength(){
        System.out.println(name.length());
    }
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException();
        npe.printLength();

    }
}
