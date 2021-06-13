public class _1_IncrementDecrementOperator {
    public static void main(String[] args) {
        int guests = 0;
        System.out.println("Pre-increment: " + ++guests);
        System.out.println(guests);

        int employess = 0;
        System.out.println("Post-increment: " + employess++);//the value is updated after is shown.
        System.out.println(employess);

        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is: " + lion);
        System.out.println("tiger is: " + tiger);

    }

}
