package _03_UpdatingOurExampleForMultipleModules;

public class _09_CreatingTheCareModule {
    /*
    // HippoBirthday.java
    package zoo.animal.care.details;
    import zoo.animal.feeding.*;
    public class HippoBirthday {
        private Task task;
    }

    // Diet.java
    package zoo.animal.care.medical;
    public class Diet { }

    This time the module-info.java file specifies three things.
    1: module zoo.animal.care {
    2:      exports zoo.animal.care.medical; // So it can be used by other modules
    3:      requires zoo.animal.feeding;    // The requires statement specifies that a
                                            module is needed. The zoo.animal.care module depends on the
                                            zoo.animal.feeding module.
    4: }

    We follow the steps as before:
    1) creating the files
    2)Figuring out directory sructure
    You might have noticed that the packages begin with the same prefix as
    the module name. This is intentional. You can think of it as if the module
    name “claims” the matching package and all subpackages.
    3) To review, we now compile and package the module:
    javac -p mods -d care care/zoo/animal/care/details/*.java care/zoo/animal/care/medical/*.java care/module-info.java

    ORDER MATTERS!
    module-info.java should be the last one to be compiled.

    4) Create the module JAR.
    jar -cvf mods/zoo.animal.care.jar -C care/ .

     */


}
