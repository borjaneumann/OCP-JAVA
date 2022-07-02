package _5_CreatingAService;

public class _16_InvokingFromAConsumer {
    /*
    Next up is to call the service locator by a consumer. A consumer (or
    client) refers to a module that obtains and uses a service. Once the
    consumer has acquired a service via the service locator, it is able to invoke
    the methods provided by the service provider interface.

    // Tourist.java
    package zoo.visitor;
    import java.util.*;
    import zoo.tours.api.*;
    import zoo.tours.reservations.*;
    public class Tourist {
        public static void main(String[] args) {
            Tour tour = TourFinder.findSingleTour();
            System.out.println("Single tour: " + tour);
            List<Tour> tours = TourFinder.findAllTours();
            System.out.println("# tours: " + tours.size());
        }
    }
    Our module definition doesn't need to know anything about the
    implementations since the zoo.tours.reservations module is handling
    the lookup.
    // module-info.java
    module zoo.visitor {
        requires zoo.tours.api;
        requires zoo.tours.reservations;
    }
    This time, we get to run a program after compiling and packaging.

    javac -p mods -d consumerModule

    consumerModule/zoo/visitor/*.java
    consumerModule/module-info.java
    jar -cvf mods/zoo.visitor.jar -C consumerModule/ .
    java -p mods -m zoo.visitor/zoo.visitor.Tourist
    The program outputs the following:
    Single tour: null
    # tours: 0
    Well, that makes sense. We haven't written a class that implements the
    interface yet.

     */
}
