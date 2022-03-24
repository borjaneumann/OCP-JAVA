package _04_ApplyingTheStaticKeyword;

public class _12_StaticVsInstance {
    /*
    A static member cannot call an instance member without referencing
    an instance of the class. This shouldn’t be a surprise since static
    doesn’t require any instances of the class to even exist.

    The following is a common mistake for rookie programmers to make:
    */
    private String name = "Static class"; //the problem is fixed swaping private for static and ...

    public static void first() {
    }

    public static void second() {
    }

    public static void third() { // adding static to the method declaration
//        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
//        third(); // DOES NOT COMPILE
        new _12_StaticVsInstance().third(); // Another possible solution
    }

    /*
    A static method or instance method can call a static method because static methods don’t require an object
    to use. Only an instance method can call another instance method on the same class without using a
    reference variable, because instance methods do require an object. Similar logic applies for the instance and static
    variables.

    public class Giraffe {
        public void eat(Giraffe g) {}
        public void drink() {};
        public static void allGiraffeGoHome(Giraffe g) {}
        public static void allGiraffeComeOut() {}
    }

     Static vs. instance calls
    Type                    Calling                 Legal?
    =======================================================
    allGiraffeGoHome()      allGiraffeComeOut()     Yes
    allGiraffeGoHome()      drink()                 No
    allGiraffeGoHome()      g.eat()                 Yes
    eat()                   allGiraffeComeOut()     Yes
    eat()                   drink()                 Yes
    eat()                   g.eat()                 Yes


    Do you understand why the following lines fail to compile?
    public class Gorilla {
        public static int count;
        public static void addGorilla() { count++; }
        public void babyGorilla() { count++; }
        public void announceBabies() {
            addGorilla();
            babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
        babyGorilla(); // DOES NOT COMPILE
    }
    public int total;
    public static double average = total / count; // DOES NOT COMPILE
    }
    Lines 3 and 4 are fine because both static and instance methods can refer
    to a static variable. Lines 5–8 are fine because an instance method can
    call a static method. Line 11 doesn’t compile because a static method
    cannot call an instance method. Similarly, line 15 doesn’t compile because
    a static variable is trying to use an instance variable.

    A common use for static variables is counting the number of instances:

    class Counter {
        private static int count;

        public Counter() {
            count++;
        }

        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            System.out.println(count); // 3
        }
    }
    Notice that we didn’t write Counter.count. We could have. It isn’t
    necessary because we are already in that class so the compiler can infer it.

    EXTRA
    =====
    DOES EACH INSTANCE HAVE ITS OWN COPY OF THE CODE?
    Each object has a copy of the instance variables. There is only one
    copy of the code for the instance methods. Each instance of the class
    can call it as many times as it would like. However, each call of an
    instance method (or any method) gets space on the stack for method
    parameters and local variables.
    The same thing happens for static methods. There is one copy of
    the code. Parameters and local variables go on the stack.
    Just remember that only data gets its “own copy.” There is no need
    to duplicate copies of the code itself.

     */


}
