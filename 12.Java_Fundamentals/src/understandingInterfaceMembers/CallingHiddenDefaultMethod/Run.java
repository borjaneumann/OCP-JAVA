package understandingInterfaceMembers.CallingHiddenDefaultMethod;

public interface Run {
    public default int getSpeed() { return 10; }
}
