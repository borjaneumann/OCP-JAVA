package Patterns;

public class Singleton {
    public static void main(String[] args) {
//        Abc obj1 = new Abc();
//        Abc obj2 = new Abc();
        Abc obj3 = Abc.getObject();
        Abc obj4 = Abc.getObject();
    }

}

class Abc {
    static Abc obj = new Abc(); ///Being static the object is in memory consuming resources.
    private Abc() {};
    public static Abc getObject(){
        return obj;
    }
}
/*
Singleton class creation
The purpose is to create a single instance only.

1) We create a static object.
2) We make the constructor private.
3) We create a method that returns the static object.
 */