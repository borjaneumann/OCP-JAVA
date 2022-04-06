package _04_UnderstandingInterfaceMembers.CallingHiddenDefaultMethod;

public interface Walk {
    public default int getSpeed() { return 5; }
}
