package _04_DivingIntoTheModuloInfoFile;

public class _12_Exports {
    /*
    Now that we’ve successfully created modules, we can learn more about
    the module-info file. In these sections, we will look at exports,
    requires, provides, uses, and opens. Now would be a good time to
    mention that these keywords can appear in any order in the module-info
    file.

    In Chapter 2, “Java Building Blocks,” we provided a list of
    keywords. However, exports wasn’t on that list. Nor was module or
    requires or any of the other special words in a module-info file.
    Java is a bit sneaky here. These “keywords” are only keywords
    inside a module-info .java file. In other files, like classes and
    interfaces, you are free to name your variable exports. These
    special keywords are called directives.

    Exports
    =======
    We’ve already seen how exports packageName exports a package to other
    modules.
    It’s also possible to export a package to a specific module.
    Suppose the zoo decides that only staff members should have access to the
    talks. We could update the module declaration as follows:

    module zoo.animal.talks {
        exports zoo.animal.talks.content to zoo.staff;//only zoo.staff module is allowed access.
        exports zoo.animal.talks.media;
        exports zoo.animal.talks.schedule;
        requires zoo.animal.feeding;
        requires zoo.animal.care;
    }
    You might have noticed that none of our other modules requires
    zoo.animal.talks in the first place. However, we don’t know what other
    modules will exist in the future. It is important to consider future use when
    designing modules. Since we want only the one module to have access, we
    only allow access for that module.

    EXPORTED TYPES
    We’ve been talking about exporting a package. But what does that
    mean exactly? All public classes, interfaces, and enums are
    exported. Further, any public and protected fields and methods in
    those files are visible.
    Fields and methods that are private are not visible because they are
    not accessible outside the class. Similarly, package-private fields
    and methods are not visible because they are not accessible outside
    the package.

    The exports keyword essentially gives us more levels of access control.

    Access control with modules
    Level                       Within module code                  Outside module
    ============================================================================================
    private                     Available only within class         No access
    --------------------------------------------------------------------------------------------
    default(package-private)    Available only within package       No access
    --------------------------------------------------------------------------------------------
    protected                   Available only within package       Accessible to subclasses
                                or to subclasses                    only if package is exported
    --------------------------------------------------------------------------------------------
    public                      Available to all classes            Accessible only if package
                                                                    is exported


     */
}
