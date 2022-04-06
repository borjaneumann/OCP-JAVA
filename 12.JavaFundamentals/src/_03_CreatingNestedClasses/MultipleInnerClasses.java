package _03_CreatingNestedClasses;

//This is something you might see on the exam
//but ideally not in the real world. Please never do this in
//code you write.

public class MultipleInnerClasses {
    private int x = 10;
    class B {
        private int x = 20;
        class C {
            private int x = 30;
            public void allTheX() {
                System.out.println(x); //30
                System.out.println(this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(MultipleInnerClasses.this.x); //10
            }
        }
    }

    public static void main(String[] args) {
        MultipleInnerClasses a = new MultipleInnerClasses();
        MultipleInnerClasses.B b = a.new B();
        MultipleInnerClasses.B.C c = b.new C();
        c.allTheX();

    }
}
