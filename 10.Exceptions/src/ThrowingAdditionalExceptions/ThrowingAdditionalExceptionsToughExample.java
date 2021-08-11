package ThrowingAdditionalExceptions;

public class ThrowingAdditionalExceptionsToughExample {
    public String exceptions() {
        StringBuilder result =  new StringBuilder();
        String v = null;
        try {
            try {
                result.append("before_");
                v.length();
                result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                throw new Exception();
            }
        } catch (Exception e) {
            result.append("done");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ThrowingAdditionalExceptionsToughExample a1 = new ThrowingAdditionalExceptionsToughExample();
        a1.exceptions();
    }
}
