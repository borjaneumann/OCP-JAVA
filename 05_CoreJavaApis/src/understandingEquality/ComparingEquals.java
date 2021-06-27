package understandingEquality;

public class ComparingEquals {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder("one");
        StringBuilder two = new StringBuilder("one");
        StringBuilder three = one.append("three");
        System.out.println(one == two);
        System.out.println(one == three);
        System.out.println("One: " + one);
        System.out.println("Three: " + three);
    }
}
