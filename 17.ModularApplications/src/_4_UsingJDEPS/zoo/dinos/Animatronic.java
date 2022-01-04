package _4_UsingJDEPS.zoo.dinos;

import java.time.*;
import java.util.*;

import sun.misc.Unsafe;

public class Animatronic {

    /*The jdeps command gives you information about dependencies. Luckily,
    you are not expected to memorize all the options for the exam.
    You are expected to understand how to use jdeps with projects that have
    not yet been modularized to assist in identifying dependencies and
    problems.*/

    private List<String> names;
    private LocalDate visitDate;

    public Animatronic(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }

    public void unsafeMethod() {
        Unsafe unsafe = Unsafe.getUnsafe();
    }

    //We are looking into what dependencies we will need when we do modularize this JAR.
    //javac 17.ModularApplications/src/_4_UsingJDEPS/zoo/dinos/*.java on the terminal
    //jar -cvf zoo.dino.jar . --> jar cf jar-file input-file(s)

    public static void main(String[] args) {
        System.out.println("Hello Reader!");
    }
}
