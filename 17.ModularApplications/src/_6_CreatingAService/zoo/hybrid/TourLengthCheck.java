package _6_CreatingAService.zoo.hybrid;

import java.util.OptionalInt;
import java.util.ServiceLoader;

import _6_CreatingAService.zoo.tours.api.Tour;

public class TourLengthCheck {

//package zoo.tours.hybrid;
//import java.util.*;
//import java.util.ServiceLoader.Provider;
//import zoo.tours.api.*;

    public static void main(String[] args) {
        OptionalInt max = ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .mapToInt(Tour::length)
                .max();
        max.ifPresent(System.out::println);
        OptionalInt min = ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .mapToInt(Tour::length)
                .min();
        min.ifPresent(System.out::println);
    }

    /*
    Now comes the fun part. What directives do you think we need in module‐
    info.java? It turns out we need three.

    module zoo.tours.hybrid {
    requires zoo.tours.api;
    provides zoo.tours.api.Tour with zoo.tours.hybrid.QuickTourImpl;
    uses zoo.tours.api.Tour;
    }

    We need requires because we depend on the service provider interface.
    We still need provides so the ServiceLocator can look up the service.
    Additionally, we still need uses since we are looking up the service
    interface from another module.
    */


}
