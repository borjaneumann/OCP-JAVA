package understandingInterfaceMembers.duplicateDefaultMethods;

public interface Walk {
    public default int getSpeed() { return 5; }
}
