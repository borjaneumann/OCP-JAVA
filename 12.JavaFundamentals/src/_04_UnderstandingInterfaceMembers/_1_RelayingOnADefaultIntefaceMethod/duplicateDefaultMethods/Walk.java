package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod.duplicateDefaultMethods;

public interface Walk {
    public default int getSpeed() { return 5; }
}
