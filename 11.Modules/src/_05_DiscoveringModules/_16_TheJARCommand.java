package _05_DiscoveringModules;

public class _16_TheJARCommand {
    /*
    Jar and Java commands can describe a module.

    Like the java command, the jar command can describe a module. Both of
    these commands are equivalent:

    jar -f mods/zoo.animal.feeding.jar -d
    jar --file mods/zoo.animal.feeding.jar --describe-module

    The output is slightly different from when we used the java command to
    describe the module. With jar, it outputs the following:
    zoo.animal.feeding
    jar:file:///absolutePath/mods/zoo.animal.feeding.jar /!module-info.class
    exports zoo.animal.feeding
    requires java.base mandated
    The JAR version includes the module-info in the filename, which is not a
    particularly significant difference in the scheme of things. You don’t need
    to know this difference. You do need to know that both commands can
    describe a module.
     */
}
