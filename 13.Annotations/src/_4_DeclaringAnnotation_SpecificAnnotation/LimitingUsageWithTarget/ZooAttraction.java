package _4_DeclaringAnnotation_SpecificAnnotation.LimitingUsageWithTarget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface ZooAttraction {

}
