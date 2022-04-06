package _04_UnderstandingInterfaceMembers.duplicateDefaultMethods;

public interface Walk {
    public default int getSpeed() { return 5; }
}
