package _6_CreatingAService.zoo.tours.agency;

import _6_CreatingAService.zoo.tours.api.Souvenir;
import _6_CreatingAService.zoo.tours.api.Tour;
//import zoo.tours.api.*;
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
