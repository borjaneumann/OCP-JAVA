package _04_UnderstandingInterfaceMembers.introducingPrivateInterfaceMethods;

public class ScheduleImpl implements Schedule{
    public static void main(String[] args) {
        Schedule schedule = new ScheduleImpl();
        schedule.wakeup();
    }

}
