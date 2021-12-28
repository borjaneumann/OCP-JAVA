import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class _24_CheckedExceptionsAndFunctionalInterfaces {

    private static List<String> create() throws IOException {
        throw new IOException();
    }
    public void good() throws IOException {
        _24_CheckedExceptionsAndFunctionalInterfaces.create().stream().count();
    }
    public void bad() throws IOException {
//        Supplier<List<String>> s =
//                _24_CheckedExceptionsAndFunctionalInterfaces::create; // DOES NOT COMPILE
    }
    public void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return _24_CheckedExceptionsAndFunctionalInterfaces.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
    //Another alternative is to create a wrapper method with the
    //try/catch.
    private static List<String> createSafe() {
        try {
            return _24_CheckedExceptionsAndFunctionalInterfaces.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void wrapped() {
        Supplier<List<String>> s2 =
                _24_CheckedExceptionsAndFunctionalInterfaces::createSafe;
    }

}
