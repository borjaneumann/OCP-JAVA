package _5_UsingCommonAnnotations;

public class _21_RetiringCodeWithDeprecated {
    /*
    In professional software development, you rarely write a library once and
    never go back to it. More likely, libraries are developed and maintained
    over a period of years. Libraries change for external reasons, like new
    business requirements or new versions of Java, or internal reasons, like a
    bug is found and corrected.

    Sometimes a method changes so much that we need to create a new
    version of it entirely with a completely different signature. We don't want
    to necessarily remove the old version of the method, though, as this could
    cause a lot of compilation headaches for our users if the method suddenly
    disappears.

    What we want is a way to notify our users that a new version of the method
    is available and give them time to migrate their code to the
    new version before we finally remove the old version.
    With those ideas in mind, Java includes the @Deprecated annotation. The
    @Deprecated annotation is similar to a marker annotation, in that it can be
    used without any values, but it includes some optional elements. The
    @Deprecated annotation can be applied to nearly any Java declaration,
    such as classes, methods, or variables.
    Let's say we have an older class ZooPlanner, and we've written a
    replacement ParkPlanner. We want to notify all users of the older class to
    switch to the new version.

     */
    /**
    * Design and plan a zoo.
    * @deprecated Use ParkPlanner instead.
    */
//        @Deprecated
//        public class ZooPlanner { … }

    /*
        That's it! The users of the ZooPlanner class will now receive a compiler
        warning if they are using ZooPlanner. In the next section, we'll show how
        they can use another annotation to ignore these warnings.

        ALWAYS DOCUMENT THE REASON FOR DEPRECATION
        Earlier, we discussed @Deprecated and @deprecated, the former
        being a Java annotation and the latter being a Javadoc annotation.
        Whenever you deprecate a method, you should add a Javadoc
        annotation to instruct users on how they should update their code.
        For the exam, you should know that it is good practice to document
        why a type is being deprecated and be able to suggest possible
        alternatives.
        While this may or may not appear on the exam, the @Deprecated
        annotation does support two optional values: String since() and
        boolean forRemoval(). They provide additional information about when
        the deprecation occurred in the past and whether or not the type is
        expected to be removed entirely in the future.
        /**
         * Method to formulate a zoo layout.
         * @deprecated Use ParkPlanner.planPark(String… data) instead.
         */
        //@Deprecated(since="1.8", forRemoval=true)
        //public void plan() {}

        /*
        Note that the @Deprecated annotation does not allow you to provide any
        suggested alternatives. For that, you should use the Javadoc annotation.
        When reviewing the Java JDK, you may encounter classes or
        methods that are marked deprecated, with the purpose that
        developers migrate to a new implementation. For example, the
        constructors of the wrapper classes (like Integer or Double) were
        recently marked @Deprecated, with the Javadoc note that you should
        use the factory method valueOf() instead. In this case, the
        advantage is that an immutable value from a pool can be reused,
        rather than creating a new object. This saves memory and improves
        performance.
     */
}
