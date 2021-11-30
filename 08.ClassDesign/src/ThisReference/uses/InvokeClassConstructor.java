package ThisReference.uses;

//Chaining constructors
//Calling default constructor from parameterized constructor:

public class InvokeClassConstructor {
    InvokeClassConstructor(){
        System.out.println("hello Invoke Class Constructor");
    }
    InvokeClassConstructor(int x){
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        InvokeClassConstructor icc = new InvokeClassConstructor(10);

    }
}
