public class _03_WorkingWithConfidentialInformation {
    /*
    Types of confidential data
    Category                            Examples
    ====================================================================================
    Login information                   Usernames/Passwords/Hashes of passwords
    ------------------------------------------------------------------------------------
    Banking                             Credit card numbers/Account balances/Credit score
    ------------------------------------------------------------------------------------
    PII (Personal identifiable          Social Security number (or other government ID)
    information)                        Mother's maiden name
                                        Security questions/answers
    ------------------------------------------------------------------------------------

    GUARDING SENSITIVE DATA FROM OUTPUT
    ===================================
    - The first step is to avoid putting confidential information in a toString() method.
    - What methods are called in these sensitive contexts to ensure confidential information doesn't escape.
        Such sensitive contexts include the following:
            - Writing to a log file
            - Printing an exception or stack trace
            - System.out and System.err messages
            - Writing to data files



    PROTECTING DATA IN MEMORY
    =========================
    If her application crashes, it may generate a dump file. That contains values of
    everything in memory.

    When calling the readPassword() on Console, it returns a char[] instead
    of a String. This is safer for two reasons.
    1) It is not stored as a String, so Java won't place it in the String pool,
    where it could exist in memory long after the code that used it is run.
    2) You can null out the value of the array element rather than waiting for the
    garbage collector to do it.

    For example, this code overlays the password characters with the letter x:

    Console console = System.console();
    char[] password = console.readPassword();
    Arrays.fill(password, 'x');

    When the sensitive data cannot be overwritten, it is good practice to set
    confidential data to null when you're done using it. If the data can be
    garbage collected, you don't have to worry about it being exposed later.
    Here's an example:

    LocalDate dateOfBirth = getDateOfBirth();
    // use date of birth
    dateOfBirth = null;

    The idea is to have confidential data in memory for as short a time as possible.


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
