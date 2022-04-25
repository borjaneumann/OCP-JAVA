package _6_WorkingWithGenerics._6_GenericMethods;


import java.util.List;

public class _6_UpperBoundedWildcards_2 {


}
interface Flyer {
    void fly();
}
class HangGlider implements Flyer {
    @Override
    public void fly() {
    }
}
class Goose implements Flyer {
    @Override
    public void fly() {

    }
    private void anyFlyer (List<Flyer> flyer) {}
    private void groupOfFlyers (List<? extends Flyer> flyer) {}

    //Note that we used the keyword extends rather than implements. Upper
    //bounds are like anonymous classes in that they use extends regardless of
    //whether we are working with a class or an interface.
}
