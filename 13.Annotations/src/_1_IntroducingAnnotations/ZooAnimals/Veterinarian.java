package _1_IntroducingAnnotations.ZooAnimals;

public class Veterinarian {
    @ZooAnimal(habitat = "Infirmary")
    private Lion sickLion;
    @ZooAnimal(habitat = "Safary")
    private Lion healthyLion;
    @ZooAnimal(habitat = "Special Enclosure")
    private Lion blindLion;

}
