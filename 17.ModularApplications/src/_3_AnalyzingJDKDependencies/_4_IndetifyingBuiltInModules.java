package _3_AnalyzingJDKDependencies;

public class _4_IndetifyingBuiltInModules {

    /*
    Prior to Java 9, developers could use any package in the JDK by merely
    importing it into the application. This meant the whole JDK had to be
    available at runtime because a program could potentially need anything.
    With modules, your application specifies which parts of the JDK it uses.
    This allows the application to run on a full JDK or a subset.

    You might be wondering what happens if you try to run an application that
    references a package that isn't available in the subset. No worries! The
    requires directive in the module‐info file specifies which modules need
    to be present at both compile time and runtime. This means they are
    guaranteed to be available for the application to run.

    The most important module to know is java.base. It contains most of the
    packages you have been learning about for the exam. In fact, it is so
    important that you don't even have to use the requires directive; it is
    available to all modular applications. Your module‐info.java file will
    still compile if you explicitly require java.base. However, it is redundant,
    so it's better to omit it.

    Common modules
    Module name             What it contains                                    Coverage in book
    =================================================================================================================
    java.base               Collections, Math, IO, NIO.2, Concurrency, etc.     Most of this book
    java.desktop            Abstract Windows Toolkit(AWT) and Swing             Not on the exam beyond the module name
    java.logging            Logging                                             Not on the exam beyond the module name
    java.sql                JDBC                                                Chapter 21, “JDBC”
    java.xml                Extensible Markup Language (XML)                    Not on the exam beyond the module name
     */

}
