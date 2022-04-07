package _04_DivingIntoTheModuloInfoFile;

public class _14_ProvidesUsesAndOpens {
    /*
    Provides
    ========
    The provides keyword specifies that a class provides an implementation
    of a service. The topic of services is covered on the 1Z0-816 exam, so for
    now, you can just think of a service as a fancy interface. To use it, you
    supply the API and class name that implements the API:
    provides zoo.staff.ZooApi with zoo.staff.ZooImpl

    Uses
    ====
    The uses keyword specifies that a module is relying on a service. To code
    it, you supply the API you want to call:
    uses zoo.staff.ZooApi

    Opens
    =====
    Since reflection can be dangerous, the module system requires developers
    to explicitly allow reflection in the module-info if they want calling
    modules to be allowed to use it. Here are two examples:

    opens zoo.animal.talks.schedule;
    opens zoo.animal.talks.media to zoo.staff;

    The first example allows any module using this one to use reflection. The
    second example only gives that privilege to the zoo.staff package.

    Java allows callers to inspect and call code at runtime with a technique
    called reflection. This is a powerful approach that allows calling code that
    might not be available at compile time. It can even be used to subvert
    access control! Don’t worry—you don’t need to know how to write code
    using reflection for the exam.
     */

}
