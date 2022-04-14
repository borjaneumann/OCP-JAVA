package _03_CreatingNestedClasses.declaringInnerClass._2_StaticNestedClass;

//Since the class is static, you do not
//need an instance of Enclosing to use it. You are allowed to access
//private instance variables

public class Enclosing {
    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
