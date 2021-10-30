package _4_DeclaringAnnotation_SpecificAnnotation.SupportingDuplicatesWithRepeatable;

//With these two annotations, our original Zoo class will now compile.
//Notice that we never actually use @Risks in our Zoo class. Given the
//declaration of the Risk and Risks annotations, the compiler takes care of
//applying the annotations for us.

public class Zoo {
    public static class Monkey {}

    @Risk(danger="Silly")
    @Risk(danger="Aggresive", level = 5)
    @Risk(danger="Violent", level = 10)
    private Monkey monkey;

    //old way, an array of annotations. Not the preferred way.

    //@Risks({
    //@Risk(danger="Silly"),
    //@Risk(danger="Aggressive",level=5),
    //@Risk(danger="Violent",level=10)
    //})
    //private Monkey monkey;
}
