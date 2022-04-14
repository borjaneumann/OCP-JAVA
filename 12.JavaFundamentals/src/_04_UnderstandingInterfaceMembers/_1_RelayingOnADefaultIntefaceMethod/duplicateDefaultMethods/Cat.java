package _04_UnderstandingInterfaceMembers._1_RelayingOnADefaultIntefaceMethod.duplicateDefaultMethods;

//public class Cat implements Walk, Run { //Does not compile, Java doesnt know which .getSpeed() method to implement.
//    public static void main(String[] args) {
//        System.out.println(new Cat().getSpeed());
//    }
//}

public class Cat implements Walk, Run {
    public int getSpeed() { return 1; } //solved by overriding
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}