package _4_DeclaringAnnotation_SpecificAnnotation.SupportingDuplicatesWithRepeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();
    int level() default 1;
}
