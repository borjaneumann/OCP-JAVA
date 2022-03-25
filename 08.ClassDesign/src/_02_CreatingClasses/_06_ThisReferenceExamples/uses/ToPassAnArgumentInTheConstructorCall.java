package _02_CreatingClasses.ThisReference.uses;

public class ToPassAnArgumentInTheConstructorCall {

    //We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes.
    A4 obj;

    ToPassAnArgumentInTheConstructorCall (A4 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);
    }

    public static void main(String[] args) {
        A4 a = new A4();
    }
}
class A4 {
    int data = 10;
    A4(){
        ToPassAnArgumentInTheConstructorCall b = new ToPassAnArgumentInTheConstructorCall(this);
        b.display();
    }
}
