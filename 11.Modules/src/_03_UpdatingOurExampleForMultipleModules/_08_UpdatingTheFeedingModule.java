package _03_UpdatingOurExampleForMultipleModules;

public class _08_UpdatingTheFeedingModule {
    /*
    Since we will be having our other modules call code in the
    zoo.animal.feeding package, we need to declare this intent in the
    module-info file.

    Export package so it is available to other packages
    =================================
    The exports keyword is used to indicate that a module intends for those
    packages to be used by Java code outside the module. As you might
    expect, without an exports keyword, the module is only available to be
    run from the command line on its own. In the following example, we
    export one package:

    module zoo.animal.feeding {
        exports zoo.animal.feeding;
    }

    After the change we need to recompile and repackage.
    Same commands:

    javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
    jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .


     */
}
