package _1_IntroducingAnnotations;

public class _02_PurposeOfAnnotation {
    /*
    The purpose of an annotation is to assign metadata attributes to classes,
    methods, variables, and other Java types.
    Annotations start with the at ( @) symbol and can contain attribute/value pairs called
    elements.

    public class Mammal {}
    public class Bird {}
    @ZooAnimal public class Lion extends Mammal {}
    @ZooAnimal public class Peacock extends Bird {}

    Rules
    =====
    1) Annotations function a lot like interfaces. In this example, annotations allow us to mark a class as
    a ZooAnimal without changing its inheritance structure.
    So if annotations function like interfaces, why don't we just use interfaces?
    While interfaces can be applied only to classes, annotations can be applied
    to any declaration including classes, methods, expressions, and even other
    annotations. Also, unlike interfaces, annotations allow us to pass a set of
    values where they are applied.

    2) Annotations establish relationships that make it easier to manage data about our application.
    public class Veterinarian {
        @ZooAnimal(habitat="Infirmary") private Lion sickLion;
        @ZooAnimal(habitat="Safari") private Lion healthyLion;
        @ZooAnimal(habitat="Special Enclosure") private Lion
        blindLion;
    }

    3) An annotation ascribes custom information on the declaration where it is defined.
    This turns out to be a powerful tool, as the same annotation can often be applied
    to completely unrelated classes or variables.

    4) Annotations are optional metadata and by themselves do not do anything.
    This means you can take a project filled with thousands of annotations and
    remove all of them, and it will still compile and run, albeit with potentially
    different behavior at runtime.

    This last rule might seem a little counterintuitive at first, but it refers to the
    fact that annotations aren't utilized where they are defined. It's up to the
    rest of the application, or more likely the underlying framework, to
    enforce or use annotations to accomplish tasks. For instance, marking a
    method with @SafeVarargs informs other developers and development
    tools that no unsafe operations are present in the method body. It does not
    actually prevent unsafe operations from occurring!

    While an annotation can be removed from a class and it will still
    compile, the opposite is not true; adding an annotation can trigger a
    compiler error. As we will see in this chapter, the compiler validates
    that annotations are properly used and include all required fields.

    For the exam, you need to know how to define your own custom
    annotations, how to apply annotations properly, and how to use common
    annotations. Writing code that processes or enforces annotations is not
    required for the exam

    EXTERNAL METADATA FILES
    Prior to annotations, many early Java enterprise frameworks relied
    on external XML files to store metadata about an application.
    Many of these frameworks were abandoned or rewritten to use
    annotations. These days, XML files are still used with Java projects
    but often serve to provide minimal configuration information, rather
    than low‐level metadata.

    Dependency injection, which is a common technique of decoupling a service and the clients
    that use it.






     */
}
