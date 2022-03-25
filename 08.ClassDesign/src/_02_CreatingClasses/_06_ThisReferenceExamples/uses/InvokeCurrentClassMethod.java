package _02_CreatingClasses.ThisReference.uses;

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
