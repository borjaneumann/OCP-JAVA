package understandingInterfaceMembers.duplicateDefaultMethods;

public interface Run {
    public default int getSpeed() { return 10; }
}
