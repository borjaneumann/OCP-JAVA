package _4_DeclaringAnnotation_SpecificAnnotation;

public class _13_LimitingUsageWithTarget {
    /*
    When defining your own annotation, you might want to limit it
    to a particular type or set of types. After all, it may not make sense
    for a particular annotation to be applied to a method parameter or local variable.

    The @Target annotation takes an array of ElementType enum values as its value() element.

    Values for the @Target annotation
    ElementType value           Applies to
    ==============================================================================
    TYPE                        Classes, interfaces, enums, annotations
    FIELD                       Instance and static variables, enum values
    METHOD                      Method declarations
    PARAMETER                   Constructor, method, and lambda parameters
    CONSTRUCTOR                 Constructor declarations
    LOCAL_VARIABLE              Local variables
    ANNOTATION_TYPE             Annotations
    PACKAGE *                   Packages declared in package‐info.java
    TYPE_PARAMETER              Parameterized types, generic declarations
    TYPE_USE                    Able to be applied anywhere there is a Java type declared or used
    MODULE                      Modules

    Consider the following annotation:
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Target;
    @Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
    public @interface ZooAttraction {}

    Based on this annotation, which of the following lines of code will
    compile?
    1: @ZooAttraction class RollerCoaster {}
    2: class Events {
    3:  @ZooAttraction String rideTrain() {
    4:      return (@ZooAttraction String) "Fun!";
    5:  }
    6:  @ZooAttraction Events(@ZooAttraction String description){
    7:      super();
    8:  }
    9:  @ZooAttraction int numPassengers; }

    Understanding the TYPE_USE Value
    ================================
    TYPE_USE is without a doubt the most complex. The TYPE_USE parameter can be used
    anywhere there is a Java type. By including it in @Target, it actually
    includes nearly all the values in Table 13.1 including classes, interfaces,
    constructors, parameters, and more. There are a few exceptions; for
    example, it can be used only on a method that returns a value. Methods
    that return void would still need the METHOD value defined in the
    annotation.
    It also allows annotations in places where types are used, such as cast
    operations, object creation with new, inside type declarations, etc. These
    might seem a little strange at first, but the following are valid TYPE_USE
    applications:

    // Technical.java
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Target;
    @Target(ElementType.TYPE_USE)
    @interface Technical {}

    // NetworkRepair.java
    import java.util.function.Predicate;
    public class NetworkRepair {
        class OutSrc extends @Technical NetworkRepair {}
        public void repair() {
            var repairSubclass = new @Technical NetworkRepair() {};
            var o = new @Technical NetworkRepair().new @Technical
            OutSrc();
            int remaining = (@Technical int)10.0;
        }
    }
    For the exam, you don't need to know all of the places TYPE_USE can be
    used, nor what applying it to these locations actually does, but you do
    need to recognize that they can be applied in this manner if TYPE_USE is
    one of the @Target options.
     */
}
