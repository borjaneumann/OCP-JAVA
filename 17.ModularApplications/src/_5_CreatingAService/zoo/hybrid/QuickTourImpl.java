package _5_CreatingAService.zoo.hybrid;

import _5_CreatingAService.zoo.tours.api.Tour;
import _5_CreatingAService.zoo.tours.api.Souvenir;
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
Conveniently, if you call ServiceLoader.load(), it returns an object that
you can loop through normally. However, requesting a Stream gives you a
different type. The reason for this is that a Stream controls when elements
are evaluated. Therefore, a ServiceLoader returns a Stream of Provider
objects. You have to call get() to retrieve the value you wanted out of
each Provider.
 */

