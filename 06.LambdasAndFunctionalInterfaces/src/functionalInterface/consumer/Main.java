package functionalInterface.consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        print(consumer, "Hello world");
    }
    public static void print(Consumer<String> consumer, String value){
        consumer.accept(value);
    }
}

