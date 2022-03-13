package _05_UnderstandingPackageDeclarationsAndImports;

public class _18_RunningAProgramInOneLineWithPAckages {
    /*
    You can use single-file source-code programs from within a package as
    long as they rely only on classes supplied by the JDK. <--- VERY IMPORTANT!!!!!
    This code meets the criteria.

    package singleFile;
    import java.util.*;
    public class Learning {
        private ArrayList list;
        public static void main(String[] args) {
            System.out.println("This works!");
        }
    }

    You can run either of these commands:

    java Learning.java // from within the singleFile directory

    java singleFile/Learning.java // from the directory above singleFile
     */
}
