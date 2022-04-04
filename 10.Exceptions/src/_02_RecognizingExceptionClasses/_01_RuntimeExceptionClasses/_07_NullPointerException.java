package _02_RecognizingExceptionClasses._01_RuntimeExceptionClasses;

public class _07_NullPointerException {
    //Instance variables and methods must be called on a non-null reference
    //Thrown when there is a null reference where an object is required
    String name;
    public void printLength(){
        System.out.println(name.length());
    }
    public static void main(String[] args) {
        _07_NullPointerException npe = new _07_NullPointerException();
        npe.printLength();

    }
}
