package _6_CreatingAService.zoo.tours.api;


import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

//import java.util.*;
//import zoo.tours.api.*;
public class TourFinder {
    //lookup methods
    public static Tour findSingleTour() {
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader)
            return tour;
        return null;
    }
    //lookup methods
    public static List<Tour> findAllTours() {
        List<Tour> tours = new ArrayList<>();
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader)
            tours.add(tour);
               return tours;
    }
}

