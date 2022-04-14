package _02_WorkingWithEnums;

public enum _07_AddingConstructorsFieldsAndMethods {
    /*
    Enums can have more in them than just a list of values. Let's say our zoo
    wants to keep track of traffic patterns for which seasons get the most
    visitors.

    1: public enum Season {
    2:      WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    3:      private final String expectedVisitors;
    4:      private Season(String expectedVisitors) {
    5:      this.expectedVisitors = expectedVisitors;
    6: }
    7: public void printExpectedVisitors() {
    8:      System.out.println(expectedVisitors);
    9: } }

    There are a few things to notice here. The list of enum values
    ends with a semicolon ( ;). While this is optional when our enum is
    composed solely of a list of values, it is required if there is anything in the
    enum besides the values.
     */

/*
    All enum constructors are implicitly private, with the modifier being
    optional. This is reasonable since you can't extend an enum and the
    constructors can be called only within the enum itself. An enum
    constructor will not compile if it contains a public or protected modifier.

    How do we call an enum method? It's easy.
    Season.SUMMER.printExpectedVisitors();
    Notice how we don't appear to call the constructor. We just say that we
    want the enum value.

    The first time that we ask for any of the enum
    values, Java constructs all of the enum values. After that, Java just returns
    the already constructed enum values. Given that explanation, you can see
    why this calls the constructor only once:

    public enum _07_OnlyOne {
        ONCE(true);
        private _07_OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }
    public class PrintTheOne {
        public static void main(String[] args) {
            System.out.print("begin,");
            _07_OnlyOne firstCall = _07_OnlyOne.ONCE; // prints constructing,
            _07_OnlyOne secondCall = _07_OnlyOne.ONCE; // doesn't print anything
            System.out.print("end");
        }
    }

    This class prints the following: begin,constructing,end

    If the _07_OnlyOne enum was used earlier, and therefore initialized sooner,
    then the line that declares the firstCall variable would not print
    anything.
    This technique of a constructor and state allows you to combine logic with
    the benefit of a list of values. Sometimes, you want to do more. For
    example, our zoo has different seasonal hours. It is cold and gets dark
    early in the winter. We could keep track of the hours through instance
    variables, or we can let each enum value manage hours itself.

    public enum Season {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SPRING {
            public String getHours() { return "9am-5pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        FALL {
            public String getHours() { return "9am-5pm"; }
        };
        public abstract String getHours();
    }
    What's going on here? It looks like we created an abstract class and a
    bunch of tiny subclasses. In a way we did. The enum itself has an
    abstract method. This means that each and every enum value is required
    to implement this method. If we forget to implement the method for one of
    the values, then we get a compiler error.
    The enum constant WINTER must implement the abstract method
    getHours()
    If we don't want each and every enum value to have a method, we can
    create a default implementation and override it only for the special cases.

    public enum Season {
        WINTER {
                public String getHours() { return "10am-3pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        SPRING, FALL;
            public String getHours() { return "9am-5pm"; }
    }
    This one looks better. We only code the special cases and let the others
    use the enum‐provided implementation. Of course, overriding getHours()
    is possible only if it is not marked final

    CREATING IMMUTABLE OBJECTS
    ==========================
    The immutable objects pattern is an object‐oriented design pattern in
    which an object cannot be modified after it is created. Instead of
    modifying an immutable object, you create a new object that
    contains any properties from the original object you want copied
    over.

    You might have noticed that in each of these enum examples, the list
    of values came first. This was not an accident. Whether the enum is
    simple or contains a ton of methods, constructors, and variables, the
    compiler requires that the list of values always be declared first.

 */
}