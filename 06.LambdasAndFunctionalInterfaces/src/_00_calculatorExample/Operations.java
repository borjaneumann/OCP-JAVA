package _00_calculatorExample;

public class Operations {
    public static void main(String[] args) {
        ICalculator addition = (a,b)->{
          double result = a + b;
            System.out.println("addition: " + result);
        };
        addition.operation(5,3);

        ICalculator substraction = (a,b)->{
            double result = a - b;
            System.out.println("substraction: " + result);
        };
        substraction.operation(5,3);

        ICalculator multiply = (a,b)->{
            double result = a * b;
            System.out.println("Multiplication: " + result);
        };
        multiply.operation(5,3);

        ICalculator division = (a,b)->{
            double result = a / b;
            System.out.println("division: " + result);
        };
        division.operation(5,3);
    }

}
