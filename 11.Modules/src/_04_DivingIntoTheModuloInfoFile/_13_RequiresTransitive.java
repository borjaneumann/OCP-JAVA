package _04_DivingIntoTheModuloInfoFile;

public class _13_RequiresTransitive {
    /*
    As you saw earlier in this chapter, requires moduleName specifies that the
    current module depends on moduleName.
    There’s also a requires transitive moduleName, which means that any module that requires this
    module will also depend on moduleName.

    Effects of requires transitive
    ==============================
    Given our newly updated module-info files and using Figure 11.14, what
    is the effect of applying the transitive modifier to the requires
    statement in our zoo.animal.care module? Applying the transitive
    modifiers has the following effect:

    - Module zoo.animal.talks can optionally declare it requires the
    zoo.animal.feeding module, but it is not required.
    - Module zoo.animal.care cannot be compiled or executed without access
    to the zoo.animal.feeding module.
    - Module zoo.animal.talks cannot be compiled or executed without
    access to the zoo.animal.feeding module.

    These rules hold even if the zoo.animal.care and zoo.animal.talks
    modules do not explicitly reference any packages in the
    zoo.animal.feeding module. On the other hand, without the transitive
    modifier in our module-info file of zoo.animal.care, the other modules
    would have to explicitly use requires in order to reference any packages
    in the zoo.animal.feeding module.

     */
}
