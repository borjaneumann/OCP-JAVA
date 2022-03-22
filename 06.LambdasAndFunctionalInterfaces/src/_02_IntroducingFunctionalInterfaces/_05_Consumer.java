package _02_IntroducingFunctionalInterfaces;

import java.util.function.Consumer;

public class _05_Consumer {
    /*
    To consume some input and perform required operation.It won’t return anything.
    It is a passive consumer that's why accepts().

    void accept(T t)

     */
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Hello world");
        consumer.accept("Hello Universe");

        Consumer<String> another = s -> System.out.println(s.length());
        another.accept("java");
    }
    public static void print(Consumer<String> consumer, String value){
        consumer.accept(value);
    }
}

