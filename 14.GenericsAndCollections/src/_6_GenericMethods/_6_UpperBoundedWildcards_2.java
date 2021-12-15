package _6_GenericMethods;


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

}
