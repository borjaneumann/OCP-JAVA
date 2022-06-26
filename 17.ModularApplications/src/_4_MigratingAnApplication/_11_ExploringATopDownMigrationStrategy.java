package _4_MigratingAnApplication;

public class _11_ExploringATopDownMigrationStrategy {
    /*
    A top‐down migration strategy is most useful when you don't have control
    of every JAR file used by your application. For example, suppose another
    team owns one project. They are just too busy to migrate. You wouldn't
    want this situation to hold up your entire migration.
    For a top‐down migration, you follow these steps:

    1. Place all projects on the module path.
    2. Pick the highest‐level project that has not yet been migrated.
    3. Add a module‐info file to that project to convert the automatic module
    into a named module. Again, remember to add any exports or requires
    directives. You can use the automatic module name of other modules
    when writing the requires directive since most of the projects on the
    module path do not have names yet.
    4. Repeat with the next‐lowest‐level project until you are done.

    With a top‐down migration, you are conceding that all of the lower‐level
    dependencies are not ready but want to make the application itself a
    module.
    During migration, you have a mix of named modules and automatic
    modules. The named modules are the higher‐level ones that have been
    migrated. They are on the module path and have access to the automatic
    modules. The automatic modules are also on the module path.

    TABLE 17.7 Comparing migration strategies
    Category                    Bottom‐Up                   Top‐Down
    ============================================================================
    A project that              Unnamed module on           Named module on the
    depends on all others       the classpath               module path
    ----------------------------------------------------------------------------
    A project that has no       Named module on             Automatic module on
    dependencies                the module path             the module path
     */
}
