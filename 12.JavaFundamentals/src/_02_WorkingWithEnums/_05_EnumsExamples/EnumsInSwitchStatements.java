package _02_WorkingWithEnums._05_EnumsExamples;

public class EnumsInSwitchStatements {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
