package _03_UpdatingOurExampleForMultipleModules;

public class _10_CreatingTheTalksModule {
    /*
    You’ll learn how to handle exporting multiple packages or requiring
    multiple modules. In Figure 11.10, observe that the zoo.animal.talks
    module depends on two modules: zoo.animal.feeding and
    zoo.animal.care. This means that there must be two requires statements
    in the module-info.java file.

    1: module zoo.animal.talks {
    2:      exports zoo.animal.talks.content;
    3:      exports zoo.animal.talks.media;
    4:      exports zoo.animal.talks.schedule;
    5:
    6:      requires zoo.animal.feeding;
    7:      requires zoo.animal.care;
    8: }

    javac -p mods -d talks talks/zoo/animal/talks/content/*.java talks/zoo/animal/talks/media/*.java
    talks/zoo/animal/talks/schedule/*.java talks/module-info.java


    jar -cvf mods/zoo.animal.talks.jar -C talks/ .


     */
}
