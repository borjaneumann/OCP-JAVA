public class _1_IncrementDecrementOperator {
    public static void main(String[] args) {
        int guests = 0;
        System.out.println("Original guests value: " + guests);
        System.out.println("Guests with Pre-increment: " + ++guests);
        System.out.println("Guests after Pre-increment: " + guests);
        System.out.println();

        int employess = 0;
        System.out.println("Original employees value: " + employess);
        System.out.println("Employees with Post-increment: " + employess++);//the value is updated after is shown.
        System.out.println("Employees after Post-increment: " + employess);
        System.out.println();

        int lion = 4;
        System.out.println("Original Lion value: " + lion);
        int tiger = ++lion * 6 / lion--; //keep a good eye on this example. The second time lion is used the value has been already updated to 5.
        System.out.println("Lion is: " + lion);
        System.out.println("Tiger is: " + tiger);

    }

}
