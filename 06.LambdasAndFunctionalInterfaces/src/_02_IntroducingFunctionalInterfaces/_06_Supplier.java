package _02_IntroducingFunctionalInterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class _06_Supplier {
    /*
    To supply some value base on requirement. Gets a result and Returns a result

    T get()

     */
    public static void main(String[] args) {
        Supplier<Integer> number = () -> 42;
        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(number.get());
        System.out.println(random.get());

        System.out.println(returnNumber(number));
        System.out.println(returnNumber(random));
    }
    private static int returnNumber(Supplier<Integer> supplier){
        return supplier.get();
    }
}

