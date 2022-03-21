package _02_WritingWhileLoops;

public class _07_ComparingWhileAndDoWhileLoops {
    /*In practice, it might be difficult to determine when you should use a while
    loop and when you should use a do/while loop. The short answer is that it
    does not actually matter.
    Any while loop can be converted to a do/while loop, and vice versa.

    For example, compare this while loop:*/
    public static void main(String[] args) {
        int llama = 15;
        while (llama > 10) {
            System.out.println("Llama!");
            llama--;
        }
        //do/while loop
        int salmon = 15;
        if (salmon > 10) {
            do {
                System.out.println("Salmon!");
                salmon--;
            } while (salmon > 10);
        }

    /*
    We recommend you use a while loop when the code will execute zero or
    more times and a do/while loop when the code will execute one or more
    times. To put it another way, you should use a do/while loop when you
    want your loop to execute at least once.

    The do/while statement has the advantage that you could leverage
    the existing if statement and perform some other operation in a new else
    branch, as shown in the following example:
     */
        int lion = 12;
        if(lion > 10) {
            do {
                System.out.println("lion!");
                lion--;
            } while(lion > 10);
        } else {
            lion++;
        }
    }
}
