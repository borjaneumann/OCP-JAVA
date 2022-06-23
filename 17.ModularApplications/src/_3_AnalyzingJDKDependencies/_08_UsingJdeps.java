package _3_AnalyzingJDKDependencies;

public class _08_UsingJdeps {
    /*
    The jdeps command gives you information about dependencies.
    You are expected to understand how to use jdeps with projects that have
    not yet been modularized to assist in identifying dependencies and
    problems.


    First, we will create a JAR file from this class. If you are
    following along, feel free to copy the class from the online examples
    referenced at the beginning of the chapter rather than typing it in.


    // Animatronic.java
    package zoo.dinos;
    import java.time.*;
    import java.util.*;
    import sun.misc.Unsafe;
    public class Animatronic {
        private List<String> names;
        private LocalDate visitDate;
        public Animatronic(List<String> names, LocalDate visitDate){
            this.names = names;
            this.visitDate = visitDate;
        }
        public void unsafeMethod() {
            Unsafe unsafe = Unsafe.getUnsafe();
        }
    }
    This example is silly. It uses a number of unrelated classes. The Bronx
    Zoo really did have electronic moving dinosaurs for a while, so at least the
    idea of having dinosaurs in a zoo isn't beyond the realm of possibility.
    Now we can compile this file. You might have noticed there is no module‐
    info.java file. That is because we aren't creating a module. We are
    looking into what dependencies we will need when we do modularize this JAR.

    javac zoo/dinos/*.java


    Compiling works, but it gives you some warnings about Unsafe being an
    internal API. Don't worry about those for now—we'll discuss that shortly.
    (Maybe the dinosaurs went extinct because they did something unsafe.)
    Next, we create a JAR file.

    jar -cvf zoo.dino.jar .


    We can run the jdeps command against this JAR to learn about its
    dependencies. First, let's run the command without any options. On the
    first two lines, the command prints the modules that we would need to add
    with a requires directive to migrate to the module system. It also prints a
    table showing what packages are used and what modules they correspond to.

    jdeps zoo.dino.jar
    zoo.dino.jar -> java.base
    zoo.dino.jar -> jdk.unsupported
    zoo.dinos -> java.lang java.base
    zoo.dinos -> java.time java.base
    zoo.dinos -> java.util java.base
    zoo.dinos -> sun.misc JDK internal API
    (jdk.unsupported)

    If we run in summary mode, we only see just the first part where jdeps

    lists the modules.
    jdeps -s zoo.dino.jar
    zoo.dino.jar -> java.base
    zoo.dino.jar -> jdk.unsupported


    For a real project, the dependency list could include dozens or even
    hundreds of packages. It's useful to see the summary of just the modules.
    This approach also makes it easier to see whether jdk.unsupported is in
    the list.

    You might have noticed that jdk.unsupported is not in the list of
    modules you saw in Table 17.6. It's special because it contains
    internal libraries that developers in previous versions of Java were
    discouraged from using, although many people ignored this warning.
    You should not reference it as it may disappear in future versions of
    Java.


    The jdeps command has an option to provide details about these
    unsupported APIs. The output looks something like this:
    jdeps --jdk-internals zoo.dino.jar
    zoo.dino.jar -> jdk.unsupported
    zoo.dinos.Animatronic -> sun.misc.Unsafe
    JDK internal API (jdk.unsupported)
    Warning: <omitted warning>
    JDK Internal API Suggested Replacement
    ________________ _____________________
    sun.misc.Unsafe See http://openjdk.java.net/jeps/260


    The ‐‐jdk‐internals option lists any classes you are using that call an
    internal API along with which API. At the end, it provides a table
    suggesting what you should do about it. If you wrote the code calling the
    internal API, this message is useful. If not, the message would be useful to
    the team who did write the code. You, on the other hand, might need to
    update or replace that JAR file entirely with one that fixes the issue. Note
    that ‐ jdkinternals is equivalent to ‐‐jdk‐internals.
    ABOUT SUN.MISC.UNSAFE
    ======================
    Prior to the Java Platform Module System, classes had to be public
    if you wanted them to be used outside the package. It was
    reasonable to use the class in JDK code since that is low‐level code
    that is already tightly coupled to the JDK. Since it was needed in
    multiple packages, the class was made public. Sun even named it
    Unsafe, figuring that would prevent anyone from using it outside the
    JDK.
    However, developers are clever and used the class since it was
    available. A number of widely used open source libraries started
    using Unsafe. While it is quite unlikely that you are using this class
    in your project directly, it is likely you use an open source library
    that is using it.
    The jdeps command allows you to look at these JARs to see
    whether you will have any problems when Oracle finally prevents
    the usage of this class. If you find any uses, you can look at whether
    there is a later version of the JAR that you can upgrade to.

     */
}
