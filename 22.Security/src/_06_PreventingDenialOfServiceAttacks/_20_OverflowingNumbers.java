package _06_PreventingDenialOfServiceAttacks;

public class _20_OverflowingNumbers {
    /*
    OVERFLOWING NUMBERS
    ===================
    When checking file size, be careful with an int type and loops. Since an
    int has a maximum size, exceeding that size results in integer overflow.
    Incrementing an int at the maximum value results in a negative number,
    so validation might not work as expected. In this example, we have a
    requirement to make sure that we can add a line to a file and have the size
    stay under a million.*/

    public static void main(String[] args) {
        System.out.println(enoughRoomToAddLine(100));
        System.out.println(enoughRoomToAddLine(2_000_000));
        System.out.println(enoughRoomToAddLine(Integer.MAX_VALUE));
    }
    public static boolean enoughRoomToAddLine(int requestedSize) {
        int maxLength = 1_000_000;
        String newLine = "END OF FILE";
        int newLineSize = newLine.length();
        return requestedSize + newLineSize < maxLength;
    }/*
    The output of this program is as follows:
    true
    false
    true

    The first true should make sense. We start with a small file and add a
    short line to it. This is definitely under a million. The second value is
    false because two million is already over a million even after adding our
    short line.

    Then we get to the final output of true. We start with a giant number that
    is over a million. Adding a small number to it exceeds the capacity of an
    int. Java overflows the number into a very negative number. Since all
    negative numbers are under a million, the validation doesn't do what we
    want it to.
    When accepting numeric input, you need to verify it isn't too large or too
    small. In this example, the input value requestedSize should have been
    checked before adding it to newLineSize.
     */
}
