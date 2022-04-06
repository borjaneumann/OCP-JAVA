package _03_HandlingExceptions;

public class _18_2_TryCatchFinallyExample2 {
    public static void main(String[] args) {
        _18_2_TryCatchFinallyExample2 tac2 = new _18_2_TryCatchFinallyExample2();
        System.out.println(tac2.goHome());
    }

    int goHome() {
        try {
            //optionally throw an exception here
            System.out.println("1");
            return -1;
        } catch (Exception e) {
            System.out.println("2");
            return -2;
        } finally {
            System.out.println("3");
            return -3;
        } // 1, 3 , -3
    }
}
