package _03_WorkingWithConfidentialInformation;

public class _08_ProtectingDataInMemory {
    /*
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
     */
}
