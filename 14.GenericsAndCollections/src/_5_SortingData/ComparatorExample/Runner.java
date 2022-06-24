package _5_SortingData.ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("HP","Black",1200));
        laptopList.add(new Laptop("Mac","White",1000));
        laptopList.add(new Laptop("Sony","Grey",1200));
        laptopList.add(new Laptop("HP","Black",850));

        Collections.sort(laptopList);
        for (Laptop l: laptopList) {
            System.out.println(l);
        }
    }
}
