package _1_ReviewingExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class _4_InheritingExceptionClasses {
    /*
    For the exam, you should know that
    NumberFormatException inherits from IllegalArgumentException. You
    should also know that FileNotFoundException and
    NotSerializableException both inherit from IOException.
     */
    public static void main(String[] args) {
//        try {
//            throw new IOException();
//        } catch (IOException | FileNotFoundException e) {} // DOES NOT COMPILE (redundant)
//
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//        } catch (FileNotFoundException e) {}
        /* DOES NOT COMPILE (trying to catch a more specific exception
        (after already catching a broader exception) results in unreachable code
        and a compiler error.)*/
    }

}
