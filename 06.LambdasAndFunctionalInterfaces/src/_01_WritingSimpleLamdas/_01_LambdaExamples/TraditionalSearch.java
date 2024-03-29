package _01_WritingSimpleLamdas._01_LambdaExamples;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        //list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add( new Animal("fish", false, true));
        animals.add( new Animal("Kangaroo", true, false));
        animals.add( new Animal("rabbit", true, false));
        animals.add( new Animal("turtle", false, true));

        //pass class that does check
        print(animals, new CheckIfHopper());
        //Now we come with the Lambda
        print(animals,a->a.canHop());
        print(animals,a->a.canSwim());
        print(animals,a->!a.canSwim());

        //Lambda syntax. The two methods below do the same thing.
        //a -> a.canHop();
        //(Animal a) ->{return a.canHop;}
    }
    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal: animals){
            //the general check
            if(checker.test(animal)){
                System.out.print(animal + " ");
            }
            System.out.println();
        }
    }
}
