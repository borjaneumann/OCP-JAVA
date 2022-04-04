package _03_IntroducingInnerClasses;

public class _11_UsingAMemberInnerClass {
    /*
    One of the ways a member inner class can be used is by calling it in the
    outer class. Continuing with our previous example, let’s define a method
    in Zoo that makes use of the member inner class with a new sellTicket()
    method.
    public class Zoo {
        private interface Paper {
        public String getId();
        }
        public class Ticket implements Paper {
            private String serialNumber;
            public String getId() { return serialNumber; }
        }
        public Ticket sellTicket(String serialNumber) {
            var t = new Ticket();
            t.serialNumber = serialNumber;
            return t;
        }
    }
    The advantage of using a member inner class in this example is that the
    Zoo class completely manages the lifecycle of the Ticket class.

    Let’s add an entry point to this example.
    public class Zoo {
    ...
        public static void main(String... unused) {
            var z = new Zoo();
            var t = z.sellTicket("12345");
            System.out.println(t.getId()+" Ticket sold!");
        }
    }
    This compiles and prints 12345 Ticket sold! at runtime.
     */
}
