package _02_IntroducingFunctionalInterfaces._05_Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> number = () -> 42;
        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(returnNumber(number));
        System.out.println(returnNumber(random));

    }
    private static int returnNumber(Supplier<Integer> supplier){
        return supplier.get();
    }
    private static int returnRandom(Supplier<Integer> supplier){
        return supplier.get();
    }
}

