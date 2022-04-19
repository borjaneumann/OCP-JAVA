package _4_DeclaringAnnotation_SpecificAnnotation;

public class _15_GeneratingJavaDocWithDocumented {
    /*
    When trying to determine what methods or classes are available in Java or
    a third‐party library, you've undoubtedly relied on web pages built with
    Javadoc. Javadoc is a built‐in standard within Java that generates
    documentation for a class or API.

    In fact, you can generate Javadoc files for any class you write! Better yet,
    you can add additional metadata, including comments and annotations,
    that have no impact on your code but provide more detailed and user‐
    friendly Javadoc files.

    For the exam, you should be familiar with the marker annotation
    @Documented. If present, then the generated Javadoc will include
    annotation information defined on Java types. Because it is a marker
    annotation, it doesn't take any values; therefore, using it is pretty easy.

    // Hunter.java
    import java.lang.annotation.Documented;
    @Documented public @interface Hunter {}
    // Lion.java
    @Hunter public class Lion {}
    In this example, the @Hunter annotation would be published with the Lion
    Javadoc information because it's marked with the @Documented annotation.
    JAVA VS. JAVADOC ANNOTATIONS
    Javadoc has its own annotations that are used solely in generating
    data within a Javadoc file.

     */
    public class ZooLightShow {
    /**
    * Performs a light show at the zoo.
    *
    * @param distance length the light needs
    to travel.
    * @return the result of the light show
    operation.
    * @author Grace Hopper
    * @since 1.5
    * @deprecated Use EnhancedZooLightShow.lights()
    instead.
    */
        @Deprecated(since="1.5") public String
        perform(int distance) {
            return "Beginning light show!";
        }
    }
    /*
    Be careful not to confuse Javadoc annotations with the Java
    annotations. Take a look at the @deprecated and @Deprecated
    annotations in this example. The first, @deprecated, is a Javadoc
    annotation used inside a comment, while @Deprecated is a Java
    annotation applied to a class. Traditionally, Javadoc annotations are
    all lowercase, while Java annotations start with an uppercase letter.
        */
}
