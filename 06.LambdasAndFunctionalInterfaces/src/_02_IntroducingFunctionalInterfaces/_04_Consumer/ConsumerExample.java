package _02_IntroducingFunctionalInterfaces._04_Consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Hello world");
        consumer.accept("Hello Universe");
    }
    public static void print(Consumer<String> consumer, String value){
        consumer.accept(value);
    }
}

