package _02_CreatingClasses.ThisReference.uses;

public class ToReturnCurrentClassInstance {

    //We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive).

    ToReturnCurrentClassInstance getToReturnCurrentClassInstance(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java");
        System.out.println("This reference: " + this);
    }

    public static void main(String[] args) {
        new ToReturnCurrentClassInstance().getToReturnCurrentClassInstance().msg();
        ToReturnCurrentClassInstance obj = new ToReturnCurrentClassInstance();
        System.out.println("Main: " + obj);
        obj.msg();
    }
}
