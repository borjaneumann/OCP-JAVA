package ThisReference.uses;

public class ToPassAnArgumentInTheMethod {
    void m(ToPassAnArgumentInTheMethod obj){
        System.out.println("Method is invoked");
    }
    void p(){
        m(this);
    }

    public static void main(String[] args) {
        ToPassAnArgumentInTheMethod t = new ToPassAnArgumentInTheMethod();
        t.p();
    }
}
