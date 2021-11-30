package creatingNestedClasses;

public class Outer {
    private String greeting = "Hi";

    protected class Inner {
        private int repeat = 3;
        public void go() {
            for (int i = 0; i <repeat ; i++) {
                System.out.println(greeting);
            }
        }
    }
    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        //Another way to instantiate inner
        Outer outer2 =  new Outer();
        Inner inner = outer2.new Inner(); // Create the inner class
        inner.go();
    }
}
