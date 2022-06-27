package _4_MigratingAnApplication;

public class _12_SplittingABigProjectIntoModules {
    /*
    For the exam, you need to understand the basic process of splitting up a
    big project into modules.

    1) Suppose you start with an application that has a number of packages. The
    first step is to break them up into logical groupings and draw the
    dependencies between them.

    The Java Platform Module System does not allow for cyclic dependencies.
    A cyclic dependency, or circular dependency, is when two things directly or
    indirectly depend on each other. A common fixing technique is to introduce another
    module. That module contains the code that the other two modules share.
     */
}
