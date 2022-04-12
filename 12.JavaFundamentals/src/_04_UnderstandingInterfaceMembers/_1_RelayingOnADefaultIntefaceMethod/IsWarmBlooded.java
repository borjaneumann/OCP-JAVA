package _04_UnderstandingInterfaceMembers;

//The class has the option of overriding the default method, but if it does not, then the
//default implementation will be used

public interface IsWarmBlooded {

    default double getTemperature() {
        return 10.0;
    }
    boolean hasScales();
}
