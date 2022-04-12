package _04_UnderstandingInterfaceMembers.CallingHiddenDefaultMethod;

public interface Run {
    public default int getSpeed() { return 10; }
}
