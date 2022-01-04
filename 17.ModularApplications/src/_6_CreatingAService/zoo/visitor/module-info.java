//module zoo.visitor {
//    requires zoo.tours.api;
//    requires zoo.tours.reservations;
//}

/*
Commands
javac -p mods -d consumerModule
consumerModule/zoo/visitor/*.java
consumerModule/module-info.java
jar -cvf mods/zoo.visitor.jar -C consumerModule/ .
java -p mods -m zoo.visitor/zoo.visitor.Tourist
 */