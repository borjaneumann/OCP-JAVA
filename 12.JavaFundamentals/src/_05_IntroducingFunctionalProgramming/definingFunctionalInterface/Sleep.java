package introFunctionalProgramming.definingFunctionalInterface;

public interface Sleep {
    private void snore(){}
    default int getZzz() { return 1; }
}
