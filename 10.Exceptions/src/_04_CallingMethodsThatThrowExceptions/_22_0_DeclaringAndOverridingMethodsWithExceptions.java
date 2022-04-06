package _04_CallingMethodsThatThrowExceptions;

public class _22_0_DeclaringAndOverridingMethodsWithExceptions {
    /*
    When a class overrides a method from a superclass or implements a method from
    an interface, it’s not allowed to add new checked exceptions to the method
    signature. For example, this code isn’t allowed:

    class CanNotHopException extends Exception { }
    class Hopper {
            public void hop() { }
    }
    class Bunny extends Hopper {
        public void hop() throws CanNotHopException { } // DOES NOT COMPILE
    }

    Java knows hop() isn’t allowed to throw any checked exceptions because
    the hop() method in the superclass Hopper doesn’t declare any.
    An overridden method in a subclass is allowed to declare fewer exceptions
    than the superclass or interface. This is legal because callers are already
    handling them.

    class Hopper {
        public void hop() throws CanNotHopException { }
    }
    class Bunny extends Hopper {
        public void hop() { }
    }
    An overridden method not declaring one of the exceptions thrown by the
    parent method is similar to the method declaring it throws an exception
    that it never actually throws. This is perfectly legal.

    A class is allowed to declare a subclass of an exception type.
    The idea is the same. The superclass or interface has already taken care of
    a broader type. Here’s an example:

    class Hopper {
        public void hop() throws Exception { }
    }
    class Bunny extends Hopper {
        public void hop() throws CanNotHopException { }
    }

    This rule applies only to checked exceptions. The following code is legal
    because it has an unchecked exception in the subclass’s version:

    class Hopper {
        public void hop() { }
    }
    class Bunny extends Hopper {
        public void hop() throws IllegalStateException { }
    }

    The reason that it’s okay to declare new unchecked exceptions in a
    subclass method is that the declaration is redundant. Methods are free to
    throw any unchecked exceptions they want without mentioning them in
    the method declaration.





     */
}
