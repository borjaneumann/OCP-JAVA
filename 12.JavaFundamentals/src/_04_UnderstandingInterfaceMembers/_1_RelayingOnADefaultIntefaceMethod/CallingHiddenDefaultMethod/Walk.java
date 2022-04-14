package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod.CallingHiddenDefaultMethod;

public interface Walk {
    public default int getSpeed() { return 5; }
}
