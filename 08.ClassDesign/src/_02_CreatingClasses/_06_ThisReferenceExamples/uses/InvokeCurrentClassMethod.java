package _02_CreatingClasses._06_ThisReferenceExamples.uses;

public class InvokeCurrentClassMethod {
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        this.m();
    }

    public static void main(String[] args) {
        InvokeCurrentClassMethod i = new InvokeCurrentClassMethod();
        i.n();
    }
}
