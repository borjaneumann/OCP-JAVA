//Again, we need a module‐info.java file to create a module

// module-info.java
//module zoo.tours.agency {
//    requires zoo.tours.api;
//    provides zoo.tours.api.Tour with zoo.tours.agency.TourImpl;
//}

/*The module declaration requires the module containing the interface as a
dependency. We don't export the package that implements the interface
since we don't want callers referring to it directly. Instead, we use the
provides directive. This allows us to specify that we provide an
implementation of the interface with a specific implementation class. The
syntax looks like this:
provides interfaceName with className;
*/

/*
Finally, we compile and package it up.
javac -p mods -d serviceProviderModule
serviceProviderModule/zoo/tours/agency/*.java
serviceProviderModule/module-info.java
jar -cvf mods/zoo.tours.agency.jar -C serviceProviderModule/ .
Now comes the cool part. We can run the Java program again.
java -p mods -m zoo.visitor/zoo.visitor.Tourist
This time we see the following output:
Single tour: zoo.tours.agency.TourImpl@1936f0f5
# tours: 1

 */