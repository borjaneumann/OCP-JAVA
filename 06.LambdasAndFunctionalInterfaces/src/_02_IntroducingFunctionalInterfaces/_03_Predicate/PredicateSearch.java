package _02_IntroducingFunctionalInterfaces._03_Predicate;

import _01_WritingSimpleLamdas._01_LambdaExamples.Animal;

import java.util.*;
import java.util.function.Predicate;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add( new Animal("fish", false, true));
        animals.add( new Animal("Kangaroo", true, false));
        animals.add( new Animal("rabbit", true, false));
        animals.add( new Animal("turtle", false, true));

        print(animals, a->a.canHop());
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal: animals ) {
            if (checker.test(animal)){
                System.out.println(animal + " ");
            }
            System.out.println();
        }
    }
}

