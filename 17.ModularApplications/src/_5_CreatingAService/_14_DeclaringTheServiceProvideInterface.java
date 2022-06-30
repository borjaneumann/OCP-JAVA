package _5_CreatingAService;

public class _14_DeclaringTheServiceProvideInterface {
    /*
    A service is composed of an interface (or abstract class), any classes the interface references,
    and a way of looking up implementations of the interface.
    The implementations are not part of the service.

    Services are not new to Java. In fact, the ServiceLoader class was
    introduced in Java 6. It was used to make applications extensible, so you
    could add functionality without recompiling the whole application. What
    is new is the integration with modules.

    First, the zoo.tours.api module defines a Java object called Souvenir. It
    is considered part of the service because it will be referenced by the
    interface.
    // Souvenir.java
    package zoo.tours.api;
        public class Souvenir {
        private String description;
        public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
        }
    }
    Next, the module contains a Java interface type. This interface is called
    the service provider interface because it specifies what behavior our
    service will have. In this case, it is a simple API with three methods.
    // Tour.java
    package zoo.tours.api;
    public interface Tour {
        String name();
        int length();
        Souvenir getSouvenir();
    }
    All three methods use the implicit public modifier, as shown in Chapter
    12, “Java Fundamentals.” Since we are working with modules, we also
    need to create a module‐info.java file so our module definition exports
    the package containing the interface.


    // module-info.java
    module zoo.tours.api {
        exports zoo.tours.api;
    }
    Now that we have both files, we can compile and package this module.


    javac -d serviceProviderInterfaceModule
    serviceProviderInterfaceModule/zoo/tours/api/*.java
    serviceProviderInterfaceModule/module-info.java
    jar -cvf mods/zoo.tours.api.jar -C
    serviceProviderInterfaceModule/ .

    A service provider “interface” can be an abstract class rather than
    an actual interface. Since you will only see it as an interface on
    the exam, we use that term in the book.
    To review, the service includes the service provider interface and
    supporting classes it references. The service also includes the lookup
    functionality, which we will define next.
     */
}
