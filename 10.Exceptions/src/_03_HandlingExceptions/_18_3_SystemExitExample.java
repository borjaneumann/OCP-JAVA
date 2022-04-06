package _03_HandlingExceptions;

public class _18_3_SystemExitExample {
    public static void main(String[] args) {
        try {
            System.exit(23);
        } finally {
            System.out.println("Never going to get here"); //not printed
            //When System.exit() is called in the
            //try or catch block, the finally block does not run.
        }
    }
}
