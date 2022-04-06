package _01_IntroducingModules;

public class _01_ExploringAModuleIntro {
    /*
    Since Java 9, packages can be grouped into modules. We will explain the
    purpose of modules and how to build your own.
    We will also show how to run them and how to discover existing modules.

    A real project will consist of hundreds or thousands of classes grouped
    into packages. These packages are grouped into Java archive (JAR) files.
    A JAR is a zip file with some extra information, and the extension is .jar.

    Java has a vibrant open-source software (OSS) community, and those libraries
    are also supplied as JAR files. For example, there are libraries to read files,
    connect to a database, and much more.

    Some open source projects even depend on functionality in other open
    source projects. For example, Spring is a commonly used framework, and
    JUnit is a commonly used testing library. To use either, you need to make
    sure you had compatible versions of all the relevant JARs available at
    runtime. This complex chain of dependencies and minimum versions is
    often referred to by the community as JAR hell.

    The main purpose of a module is to provide groups of related packages
    to offer a particular set of functionality to developers.
    It’s like a JAR file except a developer chooses which packages are
    accessible outside the module.
     */
}
