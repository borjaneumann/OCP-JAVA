public class _4_PollingWithSleep {

    /*
    Even though multithreaded programming allows you to execute multiple
    tasks at the same time, one thread often needs to wait for the results of
    another thread to proceed. One solution is to use polling. Polling is the
    process of intermittently checking data at some fixed interval.

    For example, let's say you have a thread that modifies a shared static
    counter value and your main() thread is waiting for the thread to increase
    the value to greater than 100, as shown in the following class:
     */
    public static class CheckResults {
        private static int counter = 0;

        public static void main(String[] args) {
            new Thread(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            }).start();
            while (CheckResults.counter < 100) {
                System.out.println("Not reached yet");
            }
            System.out.println("Reached!");
        }
    }

    /*
    How many times does this program print Not reached yet? The answer is, we don't know!

    The Thread.sleep() method requests the current thread of execution rest for a specified number of milliseconds. When
    used inside the body of the main() method, the thread associated with the
    main() method will pause, while the separate thread will continue to run.
    Compare the previous implementation with the following one that uses Thread.sleep():
     */
    public static class CheckResultWithSleep {
        private static int counter = 0;

        public static void main(String[] args) throws InterruptedException {
            new Thread(() -> {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            }).start();
            while (CheckResults.counter < 100) {
                System.out.println("Not reached yet");
                Thread.sleep(1000); // 1 second
            }
            System.out.println("Reached!");
        }
    }
    /*
    While this may seem like a small amount, we have now prevented
    a possibly infinite loop from executing and locking up our program.
    Notice that we also changed the signature of the main() method, since
    Thread.sleep() throws the checked InterruptedException.
    Alternatively, we could have wrapped each call to the Thread.sleep()
    method in a try/catch block.

    How many times does the while() loop execute in this revised class? Still unknown!

    While polling does prevent the CPU from being overwhelmed with a potentially infinite loop,
    it does not guarantee when the loop will terminate.
     */
}
