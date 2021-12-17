import java.time.LocalDate;
import java.util.ArrayList;
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

        Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);

        /*We have a Supplier of a certain type. That type happens to be
        ArrayList<String>. Then calling get() creates a new instance of
        ArrayList<String>, which is the generic type of the Supplier—in other
        words, a generic that contains another generic. It's not hard to understand,
        so just look at the code carefully when this type of thing comes up.*/

    }


}
