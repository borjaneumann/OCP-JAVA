package _04_UnderstandingInterfaceMembers.usingStaticInterfaceMethods;

public class Bunny implements Hop{
    public void printDetails() {
        System.out.println(Hop.getJumpHeight());
    }

    public static void main(String[] args) {
        Bunny bunny = new Bunny();
        bunny.printDetails();
    }
}
