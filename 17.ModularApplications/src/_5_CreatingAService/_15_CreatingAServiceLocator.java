package _5_CreatingAService;

public class _15_CreatingAServiceLocator {
    /*
    To complete our service, we need a service locator. A service locator is
    able to find any classes that implement a service provider interface.
    Luckily, Java provides a ServiceLocator class to help with this task. You
    pass the service provider interface type to its load() method, and Java will
    return any implementation services it can find. The following class shows
    it in action:


    // TourFinder.java
    package zoo.tours.reservations;
    import java.util.*;
    import zoo.tours.api.*;
    public class TourFinder {
    public static Tour findSingleTour() {
    ServiceLoader<Tour> loader =
    ServiceLoader.load(Tour.class);
    for (Tour tour : loader)
    return tour;
    return null;
    }
    public static List<Tour> findAllTours() {
    List<Tour> tours = new ArrayList<>();
    ServiceLoader<Tour> loader =
    ServiceLoader.load(Tour.class);
    for (Tour tour : loader)
    tours.add(tour);
    return tours;
    }
    }
    As you can see, we provided two lookup methods. The first is a
    convenience method if you are expecting exactly one Tour to be returned.
    The other returns a List, which accommodates any number of service
    providers. At runtime, there may be many service providers (or none) that
    are found by the service locator.
    The ServiceLoader call is relatively expensive. If you are writing a
    real application, it is best to cache the result.
    Our module definition exports the package with the lookup class
    TourFinder. It requires the service provider interface package. It also has
    the uses directive since it will be looking up a service.
    // module-info.java
    module zoo.tours.reservations {
    exports zoo.tours.reservations;
    requires zoo.tours.api;
    uses zoo.tours.api.Tour;
    }
    Remember that both requires and uses are needed, one for compilation
    and one for lookup. Finally, we compile and package the module.
    javac -p mods -d serviceLocatorModule
    serviceLocatorModule/zoo/tours/reservations/*.java
    serviceLocatorModule/module-info.java
    jar -cvf mods/zoo.tours.reservations.jar -C
    serviceLocatorModule/ .
    Now that we have the interface and lookup logic, we have completed
    our service.
     */
}

