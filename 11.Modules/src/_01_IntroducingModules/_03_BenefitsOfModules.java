package _01_IntroducingModules;

public class _03_BenefitsOfModules {
    /*
    While using modules is optional, it is important to understand
    the problems they are designed to solve. Besides, knowing why modules
    are useful is required for the exam!

    Better Access Control (fifth level of access control)
    =====================================================
    Our traditional access modifiers cannot handle when we want to restrict access to
    a whole package.
    For example, we would like the packages in the
    zoo.animal.talks module to just be available to the packages in the
    zoo.staff module without making them available to any other code.
    Modules solve this problem by acting as a fifth level of access control.

    Clearer Dependency Management
    =============================
    In a fully modular environment, each of the open source projects would
    specify their dependencies in the module-info.java file.
    It is common for libraries to depend on other libraries. For example, the
    JUnit 4 testing library depends on the Hamcrest library for matching logic.
    Developers would have to find this out by reading the documentation or
    files in the project itself.
    If you forgot to include Hamcrest in your classpath, your code would run
    fine until you used a Hamcrest class. Then it would blow up at runtime
    with a message about not finding a required class. (We did mention JAR
    hell, right?)

    Custom Java Builds (compact profiles lacked flexibility, with
    The Java Platform Module System allows developers to specify what
    modules they actually needand improves security)
    ===================================================================
    The Java Platform Module System allows developers to specify what
    modules they actually need. This makes it possible to create a smaller
    runtime image that is customized to what the application needs and
    nothing more. Users can run that image without having Java installed at
    all.
    A tool called jlink is used to create this runtime image. Luckily, you only
    need to know that custom smaller runtimes are possible. How to create
    them is out of scope for the exam.
    In addition to the smaller scale package, this approach improves security.
    If you don’t use AWT and a security vulnerability is reported for AWT,
    applications that packaged a runtime image without AWT aren’t affected.

    Improved Performance
    ====================
    Since Java now knows which modules are required, it only needs to look
    at those at class loading time. This improves startup time for big programs
    and requires less memory to run.

    Unique Package Enforcement
    ==========================
    Another manifestation of JAR hell is when the same package is in two
    JARs. The Java Platform Module System prevents this scenario. A package is
    only allowed to be supplied by one module.

    In this chapter we will cover just the simplest use cases for modules.
     */
}
