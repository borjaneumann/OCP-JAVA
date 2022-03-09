package _05_UnderstandingPackageDeclarationsAndImports;

public class _09_UnderstandingPackageDeclarationsAndImports {
    /*

    INTRO

    Java comes with thousands of built-in classes, and there are countless
    more from developers like you. With all those classes, Java needs a way to
    organize them. It handles this in a way similar to a file cabinet. You put all
    your pieces of paper in folders. Java puts classes in packages. These are
    logical groupings for classes.

    Java classes are grouped into packages.
    Package names are hierarchical. If it begins with java or javax, this
    means it came with the JDK. If it starts with something else, it likely
    shows where it came from using the website name in reverse. For
    example, com.amazon.javabook tells us the code came from
    Amazon.com.

    Child package
    -------------
    The package com.amazon.javabook is a child package of com.amazon. You can tell
    because it’s longer and thus more specific.

    You’ll see package names on the exam that don’t follow this convention.
    Don’t be surprised to see package names like a.b.c.

    The rule for package names is that they are mostly letters or numbers
    separated by periods (.).

    Technically, you’re allowed a couple of other characters between the
    periods (.). The rules are the same as for variable names.
    The exam may try to trick you with invalid variable names.
    Luckily, it doesn’t try to trick you by giving invalid package names.
     */
}
