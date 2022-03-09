package _05_UnderstandingPackageDeclarationsAndImports;

public class _11_RedundantImports {
    /*
        There’s one special package in the Java world java.lang.
        This package is special in that it is automatically imported.

        1: import java.lang.System;
        2: import java.lang.*;
        3: import java.util.Random;
        4: import java.util.*;
        5: public class ImportExample {
        6:      public static void main(String[] args) {
        7:          Random r = new Random();
        8:          System.out.println(r.nextInt(10));
        9:      }
        10: }
        The answer is that three of the imports are redundant.

        Another case of redundancy involves importing a class that is in the same
        package as the class importing it.

        What imports do you think would work to get this code to compile?
        public class InputImports {
            public void read(Files files) {
            Paths.get("name");
            }
        }
        There are two possible answers. The shorter one is to use a wildcard to
        import both at the same time.

        import java.nio.file.*;

        The other answer is to import both classes explicitly.
        import java.nio.file.Files;
        import java.nio.file.Paths;

        Now let’s consider some imports that don’t work.
        - import java.nio.*; // NO GOOD - a wildcard only matches class names,
        not "file.Files"
        - import java.nio.*.*; // NO GOOD - you can only have one wildcard and
        it must be at the end
        - import java.nio.file.Paths.*; // NO GOOD - you cannot import methods
        only class names

     */
}
