package _5_CreatingAService;

public class _17_AddingAServiceProvider {
    /*
    A service provider is the implementation of a service provider interface.
    As we said earlier, at runtime it is possible to have multiple
    implementation classes or modules. We will stick to one here for
    simplicity.


    Our service provider is the zoo.tours.agency package because we've
    outsourced the running of tours to a third party.
    // TourImpl.java
    package zoo.tours.agency;
    import zoo.tours.api.*;
    public class TourImpl implements Tour {
        public String name() {
            return "Behind the Scenes";
        }
        public int length() {
            return 120;
    }
    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("stuffed animal");
        return gift;
        }
    }
    Again, we need a module‐info.java file to create a module.
    // module-info.java
    module zoo.tours.agency {
        requires zoo.tours.api;
        provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
    }
    The module declaration requires the module containing the interface as a
    dependency. We don't export the package that implements the interface
    since we don't want callers referring to it directly. Instead, we use the
    provides directive. This allows us to specify that we provide an
    implementation of the interface with a specific implementation class. The
    syntax looks like this:


    provides interfaceName with className;
    We have not exported the package containing the implementation.
    Instead, we have made the implementation available to a service
    provider using the interface.
    Finally, we compile and package it up.
    javac -p mods -d serviceProviderModule
    serviceProviderModule/zoo/tours/agency/*.java
    serviceProviderModule/module-info.java
    jar -cvf mods/zoo.tours.agency.jar -C serviceProviderModule/ .

    Now comes the cool part. We can run the Java program again.

    java -p mods -m zoo.visitor/zoo.visitor.Tourist
    This time we see the following output:
    Single tour: zoo.tours.agency.TourImpl@1936f0f5

    # tours: 1

    Notice how we didn't recompile the zoo.tours.reservations or
    zoo.visitor package. The service locator was able to observe that there
    was now a service provider implementation available and find it for us.
    This is useful when you have functionality that changes independently of
    the rest of the code base. For example, you might have custom reports or
    logging.


    In software development, the concept of separating out different
    components into stand‐alone pieces is referred to as loose coupling.
    One advantage of loosely coupled code is that it can be easily
    swapped out or replaced with minimal (or zero) changes to code that
    uses it. Relying on a loosely coupled structure allows service
    modules to be easily extensible at runtime.
    Java allows only one service provider for a service provider interface in a
    module. If you wanted to offer another tour, you would need to create a
    separate module.
     */
}
