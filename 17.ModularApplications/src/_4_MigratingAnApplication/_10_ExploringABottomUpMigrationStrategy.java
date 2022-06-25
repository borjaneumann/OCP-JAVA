package _4_MigratingAnApplication;

public class _10_ExploringABottomUpMigrationStrategy {
    /*
    The easiest approach to migration is a bottom‐up migration. This approach
    works best when you have the power to convert any JAR files that aren't
    already modules. For a bottom‐up migration, you follow these steps:

    1. Pick the lowest‐level project that has not yet been migrated. (Remember
    the way we ordered them by dependencies in the previous section?)

    2. Add a module‐info.java file to that project. Be sure to add any exports
    to expose any package used by higher‐level JAR files. Also, add a
    requires directive for any modules it depends on.

    3. Move this newly migrated named module from the classpath to the
    module path.

    4. Ensure any projects that have not yet been migrated stay as unnamed
    modules on the classpath.

    5. Repeat with the next‐lowest‐level project until you are done.

    With a bottom‐up migration, you are getting the lower‐level projects in
    good shape. This makes it easier to migrate the top‐level projects at the
    end. It also encourages care in what is exposed.
    During migration, you have a mix of named modules and unnamed
    modules. The named modules are the lower‐level ones that have been
    migrated. They are on the module path and not allowed to access any
    unnamed modules.
    The unnamed modules are on the classpath. They can access JAR files on
    both the classpath and the module path.
     */
}
