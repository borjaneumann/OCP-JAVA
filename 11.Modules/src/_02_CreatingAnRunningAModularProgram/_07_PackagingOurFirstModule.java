package _02_CreatingAnRunningAModularProgram;

public class _07_PackagingOurFirstModule {
    /*
    5) A module isn’t much use if we can run it only in the folder it was created
    in. Our next step is to package it. Be sure to create a mods directory before
    running this command:

    jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .

    There’s nothing module-specific here. In fact, you might remember seeing
    this command in Chapter 1. We are packaging everything under the
    feeding directory and storing it in a JAR file named
    zoo.animal.feeding.jar under the mods folder. This represents how the
    module JAR will look to other code that wants to use it.

    It is possible to version your module using the --module-version
    option. This isn’t on the exam but is good to do when you are ready
    to share your module with others.

    6) Now let’s run the program again, but this time using the mods directory
    instead of the loose classes:

    java -p mods -m zoo.animal.feeding/zoo.animal.feeding.Task
    All fed!
    You might notice that this command looks identical to the one in the
    previous section except for the directory. In the previous example, it was
    feeding. In this one, it is the module path of mods. Since the module path
    is used, a module JAR is being run.


     */
}
