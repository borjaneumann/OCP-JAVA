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
    public static  class CheckResults {
        private static int counter = 0;

        public static void main(String[] args) {
            new Thread(()-> {
                for (int i = 0; i <500; i++) {
                    CheckResults.counter++;
                }
            }).start();
            while(CheckResults.counter < 100) {
                System.out.println("Not reached yet");
            }
            System.out.println("Reached!");
        }
    }
    /*
    How many times does this program print Not reached yet? The answer is, we don't know!
     */

}
