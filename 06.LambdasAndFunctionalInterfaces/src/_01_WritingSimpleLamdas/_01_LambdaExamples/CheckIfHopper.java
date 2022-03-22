package _1_lambdaExample;

public class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
