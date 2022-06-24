package _6_WorkingWithGenerics._2_GenericClasses.Example2;

public class Runner {
    public static void main(String[] args) {
//        Printer booleanPrinter = new Printer<>(true);
//        Printer numberPrinter = new Printer<>(23);
//        Printer stringPrinter = new Printer<>( "Hi there");
        Printer <Cat> catPrinter = new Printer<Cat>(new Cat("Luna"));


//        booleanPrinter.print();
//        numberPrinter.print();
//        stringPrinter.print();
        catPrinter.print();
    }
}
