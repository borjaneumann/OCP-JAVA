package _6_CreatingAService.zoo.visitor;

import java.util.List;

import _6_CreatingAService.zoo.tours.api.Tour;
import _6_CreatingAService.zoo.tours.api.TourFinder;

//Consumer
public class Tourist {
    public static void main(String[] args) {
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour: " + tour);
        List<Tour> tours = TourFinder.findAllTours();
        System.out.println("# tours: " + tours.size());
    }
}

