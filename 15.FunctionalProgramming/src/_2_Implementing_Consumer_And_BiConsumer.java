import java.util.function.Consumer;

public class _2_Implementing_Consumer_And_BiConsumer {

    //You use a Consumer when you want to do something with a parameter but
    //not return anything. BiConsumer does the same thing except that it takes
    //two parameters.
    public static void main(String[] args) {

        Consumer<String> c1 = System.out ::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");


    }
}
