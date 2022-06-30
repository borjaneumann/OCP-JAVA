package Patterns;

public class SingletonEagerLazy {
    public static void main(String[] args) {
//        Abc obj1 = new Abc();
//        Abc obj2 = new Abc();
        Abc obj3 = Abc.getObject();
        Abc obj4 = Abc.getObject(); //Now
    }

}

class AbcEagerLazy {
    static AbcEagerLazy obj; ///This is how we make available only when it is called
    private AbcEagerLazy() {};
//    public static synchronized AbcEagerLazy getObject(){//Synchronized to stop having
        // more instances in different threads but affects performing speed
    public static synchronized AbcEagerLazy getObject(){
            if(obj == null) {// Double Checked Locking
                synchronized (Abc.class){
                    if (obj == null) {
                        obj = new AbcEagerLazy();
                    }
                }
        }
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