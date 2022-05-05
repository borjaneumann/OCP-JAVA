package _06_PreventingDenialOfServiceAttacks;

public class _21_WastingDataStructures {
    /*
    WASTING DATA STRUCTURES
    =======================
    One advantage of using a HashMap is that you can look up an element
    quickly by key. Even if the map is extremely large, a lookup is fast as long
    as there is a good distribution of hashed keys.

    Hacker Harry likes assumptions. He creates a class where hashCode()
    always returns 42 and puts a million of them in your map. Not so fast anymore.

    This one is harder to prevent. However, beware of untrusted classes.
    Code review can help detect the Hacker Harry in your office.

    Similarly, beware of code that attempts to create a very large array or
    other data structure. For example, if you write a method that lets you set
    the size of an array, Hacker Harry can repeatedly pick a really large array
    size and quickly exhaust the program's memory.
    Input validation is your friend.
    You could limit the size of an array parameter or, better yet, don't
    allow the size to be set at all.

    LEARNING MORE
    This exam covers security as it applies to stand‐alone applications.
    On a real project, you are likely to be using other technologies.
    Luckily, there are lists of things to watch out for.
    Open Web Application Security Project (OWASP) publishes a top
    10 list of security issues. Some will sound familiar from this chapter,
    like injection. Others, like cross‐site scripting (XSS), are specific to
    web applications. XSS involves malicious JavaScript.
    If you are deploying to a cloud provider, like Oracle Cloud or AWS,
    there is even more to be aware of. The Cloud Security Alliance
    (CSA) also publishes a security list. Theirs is called the Egregious
    Eleven. This list covers additional worries such as account
    hijacking.
    We've included links to the OWASP Top 10 and Egregious Eleven
    on our book page.
    http://www.selikoff.net/ocp11-2
    This chapter is just a taste of security. To learn more about security
    beyond the scope of the exam, please read Iron‐Clad Java, Jim
    Manico and August Detlefsen (Oracle Press, 2014).
     */
}
