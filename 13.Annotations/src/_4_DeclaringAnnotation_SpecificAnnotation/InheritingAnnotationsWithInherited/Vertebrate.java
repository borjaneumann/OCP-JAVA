package _4_DeclaringAnnotation_SpecificAnnotation.InheritingAnnotationsWithInherited;

//When this annotation is applied to a class, subclasses will inherit the
//annotation information found in the parent class.

//In this example, the @Vertebrate annotation will be applied to both
//Mammal and Dolphin objects. Without the @Inherited annotation,
//@Vertebrate would apply only to Mammal instances.

import java.lang.annotation.Inherited;

@Inherited
public @interface Vertebrate {
}
