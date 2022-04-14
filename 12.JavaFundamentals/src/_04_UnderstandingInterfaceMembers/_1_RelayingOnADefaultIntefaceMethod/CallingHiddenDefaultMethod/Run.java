package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod.CallingHiddenDefaultMethod;

public interface Run {
    public default int getSpeed() { return 10; }
}
