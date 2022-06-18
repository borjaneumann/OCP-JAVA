package _1_ReviewingModulesDirectives;

public class _02_AboutTheManifest {
    /*A JAR file is a zip file with a special directory named META‐INF.
    This directory contains one or more files. The MANIFEST.MF file is
    always present.

    The manifest contains extra information about the JAR file. For
    example, it often contains the version of Java used to build the JAR
    file. For command‐line programs, the class with the main() method
    is commonly specified.

    Each line in the manifest is a key/value pair separated by a colon.
    You can think of the manifest as a map of property names and
    values. The default manifest in Java 11 looks like this:

            Manifest-Version: 1.0
            Created-By: 11.0.2 (Oracle Corporation)
    */

    /*
    The code referencing an automatic module treats it as if there is a module‐
    info file present. It automatically exports all packages. It also determines
    the module name. How does it determine the module name?

    When Java 9 was released, authors of Java libraries were encouraged to
    declare the name they intended to use for the module in the future. All
    they had to do was set a property called Automatic‐Module‐Name in the
    MANIFEST.MF file.

    You can think of it as a promise that when the library
    becomes a named module, it will use the specified module name.
    If the JAR file does not specify an automatic module name, Java will still
    allow you to use it in the module path. In this case, Java will determine the
    module name for you.

    Suppose we have a JAR file named holiday‐calendar‐1.0.0.jar.
    First, Java will remove the extension .jar from the name. Then, Java will
    remove the version from the end of the JAR filename.

    Removing the version and extension gives us holiday‐calendar. This
    leaves us with a problem. Dashes ( ‐) are not allowed in module names.
    Java solves this problem by converting any special characters in the name
    to dots ( .). As a result, the module name is holiday.calendar.
    Finally, any adjacent dots or leading/trailing dots are removed.
     */

    /*
    Since that's a number of rules, let's review the algorithm in a list for
    determining the name of an automatic module.

    * If the MANIFEST.MF specifies an Automatic‐Module‐Name, use that. Otherwise, proceed with the remaining rules.
    * Remove the file extension from the JAR name.
    * Remove any version information from the end of the name. A version is digits and dots with
    possible extra information at the end, for example, ‐1.0.0 or ‐1.0‐RC.
    * Replace any remaining characters other than letters and numbers with dots.
    * Replace any sequences of dots with a single dot.
    * Remove the dot if it is the first or last character of the result.
     */

    /* EXAMPLE:
    # Description                   Example 1                                   Example 2
    ------------------------------------------------------------------------------------------------------------
    1 Beginning JAR name            commons2‐x‐1.0.0‐SNAPSHOT.jar               mod_$‐1.0.jar
    2 Remove file extension         commons2‐x‐1.0.0‐SNAPSHOT                   mod_$‐1.0
    3 Remove version information    commons2‐x                                  mod_$
    4 Replace special characters    commons2.x                                  mod..
    5 Replace sequence of dots      commons2.x                                  mod.
    6 Remove leading/trailing dots  commons2.x                                  mod
    (results in the automatic module
    name)
     */


}
