package _03_ConstructingForLoops;

public class ForLoops {
    public static void main(String[] args) {
        String name = "Super Mario";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        for (int i = 0; i <name.length() ; i+= 2) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String [] animals = {"lion", "tiger", "elephant"};
        boolean [] isPredator = {true,true,false};
        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i]);
        }
        System.out.println();

        String animalsAmounts [] [] = {{"Elephants", "2"},{"Tigers", "5","7"},{"Monkeys", "10"}};
        System.out.println(animalsAmounts[0][1]);
        for (int i = 0; i < animalsAmounts.length ; i++) {
            for (int j = 0; j <animalsAmounts[i].length ; j++) {

                System.out.println(animalsAmounts[i][j]);
            }
        }





    }
}
