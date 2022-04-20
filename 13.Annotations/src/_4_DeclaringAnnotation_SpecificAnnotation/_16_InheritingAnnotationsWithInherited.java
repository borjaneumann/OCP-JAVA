package _4_DeclaringAnnotation_SpecificAnnotation;

public class _16_InheritingAnnotationsWithInherited {
    /*
    Another marker annotation you should know for the exam is @Inherited.
    When this annotation is applied to a class, subclasses will inherit the
    annotation information found in the parent class.

    // Vertebrate.java
    import java.lang.annotation.Inherited;
    @Inherited public @interface Vertebrate {}

    // Mammal.java
    @Vertebrate public class Mammal {}
    // Dolphin.java
    public class Dolphin extends Mammal {}

    In this example, the @Vertebrate annotation will be applied to both
    Mammal and Dolphin objects. Without the @Inherited annotation,
    @Vertebrate would apply only to Mammal instances.

     */
}
