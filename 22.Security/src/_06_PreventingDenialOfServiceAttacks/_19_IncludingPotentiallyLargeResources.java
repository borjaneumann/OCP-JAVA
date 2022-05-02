package _06_PreventingDenialOfServiceAttacks;

public class _19_IncludingPotentiallyLargeResources {
    /*
    INCLUDING POTENTIALLY LARGE RESOURCES
    =====================================
    An INCLUSION ATTACK is when multiple files or components are embedded
    within a single file. Any file that you didn't create is suspect. Some types
    can appear smaller than they really are. For example, some types of
    images can have a “zip bomb” where the file is heavily compressed on
    disk. When you try to read it in, the file uses much more space than you
    thought.

    Extensible Markup Language (XML) files can have the same problem.
    One attack is called the “BILLION LAUGHS ATTACK” where the file gets
    expanded exponentially.
    The reason these files can become unexpectedly large is that they can
    include other entities. This means something that is 1 KB can become
    exponentially larger if it is included enough times.

    While handling large files is beyond the scope of the exam, you should
    understand how and when these issues can come up.
    Inclusion attacks are often known for when they include potentially
    hosted content. For example, imagine you have a web page that
    includes a script on another website. You don't control the script, but
    Hacker Harry does. Including scripts from other websites is
    dangerous regardless of how big they are.
     */
}
