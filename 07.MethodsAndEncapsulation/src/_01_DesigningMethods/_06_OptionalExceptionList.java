package _01_DesigningMethods;

public class _06_OptionalExceptionList {
    /*
    In Java, code can indicate that something went wrong by throwing an exception.

    it is optional and where in the method declaration it
    goes if present. For example, InterruptedException is a type of
    Exception. You can list as many types of exceptions as you want in this
    clause separated by commas.
     */
    public void zeroExceptions(){}
    public void oneException() throws IllegalArgumentException{}
    public void twoExceptions() throws IllegalArgumentException, InterruptedException {}
}
