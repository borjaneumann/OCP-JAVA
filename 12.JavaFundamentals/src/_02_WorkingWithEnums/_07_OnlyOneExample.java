package _02_WorkingWithEnums;

public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.println("constructing,");
    }
}
class PrintTheOne {
    public static void main(String[] args) {
        System.out.println("begin, ");
        OnlyOne firstCall = OnlyOne.ONCE; //prints constructing
        OnlyOne secondCall = OnlyOne.ONCE; //doesn't print anything
        System.out.println("end");
    }
}
