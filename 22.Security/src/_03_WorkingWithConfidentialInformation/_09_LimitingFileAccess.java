package _03_WorkingWithConfidentialInformation;

public class _09_LimitingFileAccess {
    /*
    DEFENSE IN DEPTH
    ================
    It is good to apply multiple techniques to protect your application.
    This approach is called defense in depth. If Hacker Harry gets
    through one of your defenses, he still doesn't get the valuable
    information inside. Instead, he is met with another defense.
    Validation and using a security policy are good techniques to use
    together to apply defense in depth.

    For the exam you need to be able to read one to understand security implications. Luckily,
    they are fairly self‐explanatory. Here's an example of a policy:

    grant {
        permission java.io.FilePermission
            "C:\\water\\fish.txt",
            "read";
    };

    This policy gives the programmer permission to read, but not update, the
    fish.txt file. If the program is allowed to read and write the file, we specify the following:

    grant {
        permission java.io.FilePermission
            "C:\\water\\fish.txt",
            "read, write";
    };

    When looking at a policy, pay attention to whether the policy grants
    access to more than is needed to run the program. If our application needs
    to read a file, it should only have read permissions. This is the principle of
    least privilege we showed you earlier.
     */
}
