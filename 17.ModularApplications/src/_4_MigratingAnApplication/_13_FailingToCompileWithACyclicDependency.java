package _4_MigratingAnApplication;

public class _13_FailingToCompileWithACyclicDependency {
    /*
    It is extremely important to understand that Java will not allow you to
    compile modules that have circular dependencies between each other. In
    this section, we will look at an example leading to that compiler error.

    First, let's create a module named zoo.butterfly that has a single class in
    addition to the module‐info.java file. If you need a reminder where the
    files go in the directory structure, see Chapter 11 or the online code
    example.
    // Butterfly.java
    package zoo.butterfly;
    public class Butterfly {
    }
    // module-info.java
    module zoo.butterfly {
    exports zoo.butterfly;
    }
    We can compile the butterfly module and create a JAR file in the mods
    directory named zoo.butterfly.jar. Remember to create a mods
    directory if one doesn't exist in your folder structure.

    javac -d butterflyModule
    butterflyModule/zoo/butterfly/Butterfly.java
    butterflyModule/module-info.java
    jar -cvf mods/zoo.butterfly.jar -C butterflyModule/ .

    Now we create a new module, zoo.caterpillar, that depends on the
    existing zoo.butterfly module. This time, we will create a module with
    two classes in addition to the module‐info.java file.

    // Caterpillar.java
    package zoo.caterpillar;
    public class Caterpillar {
    }
    // CaterpillarLifecycle.java
    package zoo.caterpillar;
    import zoo.butterfly.Butterfly;
    public interface CaterpillarLifecycle {
    Butterfly emergeCocoon();
    }
    // module-info.java
    module zoo.caterpillar {
    requires zoo.butterfly;
    }
    Again, we will compile and create a JAR file. This time it is named
    zoo.caterpillar.jar.
    javac -p mods -d caterpillarModule
    caterpillarModule/zoo/caterpillar/*.java
    caterpillarModule/module-info.java
    jar -cvf mods/zoo.caterpillar.jar -C caterpillarModule/ .
    At this point, we want to add a method for a butterfly to make caterpillar
    eggs. We decide to put it in the Butterfly module instead of the
    CaterpillarLifecycle class to demonstrate a cyclic dependency.
    We know this requires adding a dependency, so we do that first. Updating
    the module‐info.java file in the zoo.butterfly module looks like this:
    module zoo.butterfly {
    exports zoo.butterfly;
    requires zoo.caterpillar;
    }
    We then compile it with the module path mods so zoo.caterpillar is
    visible:
    javac -p mods -d butterflyModule
    butterflyModule/zoo/butterfly/Butterfly.java
    butterflyModule/module-info.java
    The compiler complains about our cyclic dependency.
    butterflyModule/module-info.java:3: error:
    cyclic dependence involving zoo.caterpillar
    requires zoo.caterpillar;
    This is one of the advantages of the module system. It prevents you from
    writing code that has cyclic dependency. Such code won't even compile!
    You might be wondering what happens if three modules are involved.
    Suppose module ballA requires module ballB and ballB requires module
    ballC. Can module ballC require module ballA? No. This would create a
    cyclic dependency. Don't believe us? Try drawing it. You can follow your
    pencil around the circle from ballA to ballB to ballC to ballA to … well,
    you get the idea. There are just too many balls in the air here!
    Java will still allow you to have a cyclic dependency between
    packages within a module. It enforces that you do not have a cyclic
    dependency between modules.

     */
}
