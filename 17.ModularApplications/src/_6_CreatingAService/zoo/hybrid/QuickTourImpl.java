package _6_CreatingAService.zoo.hybrid;

import _6_CreatingAService.zoo.tours.api.Souvenir;
import _6_CreatingAService.zoo.tours.api.Tour;
//import zoo.tours.api.*;

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

