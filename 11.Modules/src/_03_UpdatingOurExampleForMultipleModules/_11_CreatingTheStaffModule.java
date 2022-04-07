package _03_UpdatingOurExampleForMultipleModules;

public class _11_CreatingTheStaffModule {
    /*
    module zoo.staff {
        requires zoo.animal.feeding;
        requires zoo.animal.care;
        requires zoo.animal.talks;
    }
    There are three arrows in Figure 11.13 pointing from zoo.staff to other
    modules. These represent the three modules that are required. Since no
    packages are to be exposed from zoo.staff, there are no exports
    statements.

    javac -p mods -d staff staff/zoo/staff/*.java staff/module-info.java
    jar -cvf mods/zoo.staff.jar -C staff/ .
     */
}
