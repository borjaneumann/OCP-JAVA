package _03_IntroducingInnerClasses;

public class _10_DefiningAMemberInnerClass {
    /*
    You should know the difference between a top-level class and
    an inner class, permitted access modifiers for an inner class, and how to
    define a member inner class.

    A member inner class is a class defined at the member level of a class (the
    same level as the methods, instance variables, and constructors). It is the
    opposite of a top-level class, in that it cannot be declared unless it is inside
    another class.

    Developers often define a member inner class inside another class if the
    relationship between the two classes is very close. For example, a Zoo sells
    tickets for its patrons; therefore, it may want to manage the lifecycle of the
    Ticket object.

    For the 1Z0-816 exam, there are four types of nested classes you
    will need to know about: member inner classes, local classes,
    anonymous classes, and static nested classes.

    The following is an example of an outer class Zoo with an inner class Ticket:
    public class Zoo {
        public class Ticket {}
    }
    We can expand this to include an interface.
    public class Zoo {
        private interface Paper {}
        public class Ticket implements Paper {}
    }
    While top-level classes and interfaces can only be set with public or
    package-private access, member inner classes do not have the same
    restriction. A member inner class can be declared with all of the same
    access modifiers as a class member, such as public, protected, default
    (package-private), or private.
    A member inner class can contain many of the same methods and
    variables as a top-level class. Some members are disallowed in member
    inner classes, such as static members

    public class Zoo {
        private interface Paper {
            public String getId();
        }
        public class Ticket implements Paper {
            private String serialNumber;
            public String getId() { return serialNumber;}
        }
    }
    Our Zoo and Ticket examples are starting to become more interesting.

     */
}
