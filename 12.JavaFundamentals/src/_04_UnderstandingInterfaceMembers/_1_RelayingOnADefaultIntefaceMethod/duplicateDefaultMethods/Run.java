package _04_UnderstandingInterfaceMembers.duplicateDefaultMethods;

public interface Run {
    public default int getSpeed() { return 10; }
}
