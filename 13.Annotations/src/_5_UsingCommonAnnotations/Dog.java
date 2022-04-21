package _5_UsingCommonAnnotations;

public class Dog  extends Canine {
//    @Override does not compile because it is new method
    public boolean playFetch() { return true;}
//    @Override does not compile because it is a method overload
    void howl(int timeOfDay) {}
}
