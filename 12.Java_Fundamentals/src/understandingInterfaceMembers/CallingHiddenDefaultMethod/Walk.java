package understandingInterfaceMembers.CallingHiddenDefaultMethod;

public interface Walk {
    public default int getSpeed() { return 5; }
}
