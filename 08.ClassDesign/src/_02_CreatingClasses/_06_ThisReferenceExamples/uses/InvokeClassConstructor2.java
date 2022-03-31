package _02_CreatingClasses._06_ThisReferenceExamples.uses;

//Chaining constructors
//Calling parameterized constructor from default constructor:

public class InvokeClassConstructor2 {
    InvokeClassConstructor2(){
        this(5);
        System.out.println("hello Invoke Class Constructor");
    }
    InvokeClassConstructor2(int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        InvokeClassConstructor2 icc = new InvokeClassConstructor2();

    }
}
