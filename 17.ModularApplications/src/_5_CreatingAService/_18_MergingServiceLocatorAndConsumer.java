package _5_CreatingAService;

public class _18_MergingServiceLocatorAndConsumer {
    /*
    Now that you understand what all four pieces do, let's see if you
    understand how to merge pieces. We can even use streams from Chapter
    15, “Functional Programming,” to implement a method that gets all
    implementation and the length of the shortest and longest tours.
    First, let's create a second service provider. Remember the service
    provider TourImpl is the implementation of the service interface Tour.


    package zoo.tours.hybrid;
    import zoo.tours.api.*;
    public class QuickTourImpl implements Tour {
        public String name() {
        return "Short Tour";
    }
    public int length() {
        return 30;
    }
    public Souvenir getSouvenir() {
        Souvenir gift = new Souvenir();
        gift.setDescription("keychain");
        return gift;
        }
    }
    Before we introduce the lookup code, it is important to be aware of a piece
    of trickery. There are two methods in ServiceLoader that you need to
    know for the exam. The declaration is as follows, sans the full
    implementation:

    public final class ServiceLoader<S> implements Iterable<S> {
        public static <S> ServiceLoader<S> load(Class<S> service) {… }
        public Stream<Provider<S>> stream() { … }
        // Additional methods
    }
    Conveniently, if you call ServiceLoader.load(), it returns an object that
    you can loop through normally. However, requesting a Stream gives you a
    different type. The reason for this is that a Stream controls when elements
    are evaluated. Therefore, a ServiceLoader returns a Stream of Provider
    objects. You have to call get() to retrieve the value you wanted out of
    each Provider.
    Now we can create the class that merges the service locator and consumer.
    package zoo.tours.hybrid;


    import java.util.*;
    import java.util.ServiceLoader.Provider;
    import zoo.tours.api.*;
    public class TourLengthCheck {
    public static void main(String[] args) {
    OptionalInt max = ServiceLoader.load(Tour.class)
        .stream()
        .map(Provider::get)
        .mapToInt(Tour::length)
        .max();
    max.ifPresent(System.out::println);
    OptionalInt min = ServiceLoader.load(Tour.class)
        .stream()
        .map(Provider::get)
        .mapToInt(Tour::length)
        .min();
        min.ifPresent(System.out::println);
        }
    }
    As we mentioned, there is an extra method call to use get() to retrieve the
    value out of the Provider since we are using a Stream.
    Now comes the fun part. What directives do you think we need in module‐
    info.java? It turns out we need three.


    module zoo.tours.hybrid {
        requires zoo.tours.api;
        provides zoo.tours.api.Tour with
        zoo.tours.hybrid.QuickTourImpl;
        uses zoo.tours.api.Tour;
    }
    We need requires because we depend on the service provider interface.
    We still need provides so the ServiceLocator can look up the service.
    Additionally, we still need uses since we are looking up the service
    interface from another module.
    For the last time, let's compile, package, and run.


    javac -p mods -d multiPurposeModule
    multiPurposeModule/zoo/tours/hybrid/*.java
    multiPurposeModule/module-info.java
    jar -cvf mods/zoo.tours.hybrid.jar -C multiPurposeModule/ .
    java -p mods -m
    zoo.tours.hybrid/zoo.tours.hybrid.TourLengthCheck


    And it works. The output sees both service providers and prints different
    values for the maximum and minimum tour lengths:
    120
    30

     */
}
