import java.time.LocalDate;
import java.util.function.Supplier;

public class _1_ImplementingSupplier {
    public static void main(String[] args) {

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        //A Supplier is often used when constructing new objects. For
        //example, we can print two empty StringBuilder objects.
        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 =() -> new StringBuilder();

        System.out.println(s3.get());
        System.out.println(s4.get());
    }


}
