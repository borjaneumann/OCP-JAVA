package _03_HandlingExceptions;

import java.io.FileReader;
import java.io.IOException;

public class _20_ThrowingAdditionalExceptions {
    //What happens when an exception is thrown inside
    //of a catch or finally block?

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }
    }
    private static FileReader read() throws IOException {
            return null;
    }
    public void exceptionHandlingExamExample () {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
//            throw new Exception();  // This one shows that only the last exception to be thrown matters
        }
    }
}
