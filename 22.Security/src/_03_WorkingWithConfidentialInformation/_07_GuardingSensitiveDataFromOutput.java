package _03_WorkingWithConfidentialInformation;

public class _07_GuardingSensitiveDataFromOutput {
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
     */
}
