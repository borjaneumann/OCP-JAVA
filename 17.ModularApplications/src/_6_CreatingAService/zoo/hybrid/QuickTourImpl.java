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

/*
There are two methods in ServiceLoader that you need to
know for the exam. The declaration is as follows, sans the full
implementation:
public final class ServiceLoader<S> implements Iterable<S> {
public static <S> ServiceLoader<S> load(Class<S> service) {
… }
public Stream<Provider<S>> stream() { … }
// Additional methods
}
 */

