package creatingNestedClasses.declaringInnerClass.localClass;

//Here's a complicated way to multiply two
//numbers:

public class PrintNumbers {
    private int length = 5;
    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();
    }
    //Below example that does not compile
//    public void processData() {
//        final int length = 5;
//        int width = 10;
//        int heigth = 2;
//        class VolumeCalculator {
//            public int multiply() {
//                return length * width *heigth; //Does not compile because width is not final
//            }
//        }
//        width = 2;
//    }

    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }
}
