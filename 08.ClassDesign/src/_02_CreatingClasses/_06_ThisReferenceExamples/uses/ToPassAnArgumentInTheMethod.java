package _02_CreatingClasses._06_ThisReferenceExamples.uses;

public class ToPassAnArgumentInTheMethod {
    void m(ToPassAnArgumentInTheMethod obj){
        System.out.println("Method is invoked");
    }
    //The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        ToPassAnArgumentInTheMethod t = new ToPassAnArgumentInTheMethod();
        t.p();
    }
}
