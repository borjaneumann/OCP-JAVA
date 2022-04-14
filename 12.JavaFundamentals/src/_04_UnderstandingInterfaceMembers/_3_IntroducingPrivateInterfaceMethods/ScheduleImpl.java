package _04_UnderstandingInterfaceMembers._3_IntroducingPrivateInterfaceMethods;

public class ScheduleImpl implements Schedule{
    public static void main(String[] args) {
        Schedule schedule = new ScheduleImpl();
        schedule.wakeup();
    }

}
