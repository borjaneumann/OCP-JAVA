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


}
