package _4_DeclaringAnnotation_SpecificAnnotation.GeneratingJavaDocWithDocumented;

//Be careful not to confuse Javadoc annotations with the Java
//annotations. Take a look at the @deprecated and @Deprecated
//annotations in this example. The first, @deprecated, is a Javadoc
//annotation used inside a comment, while @Deprecated is a Java
//annotation applied to a class. Traditionally, Javadoc annotations are
//all lowercase, while Java annotations start with an uppercase letter.

public class ZooLightShow {
    /**
     * Performs a light show at the zoo.
     *
     * @param distance length the light needs to travel.
     * @return the result of the ligth show operation.
     * @author Grace Hopper
     * @since 1.5
     * @deprecated Use EnhancedLightShow.lights() instead
     */

    @Deprecated(since = "1.5") public static String perform(int distance) {
        return "Beginning light show!";
    }
}
